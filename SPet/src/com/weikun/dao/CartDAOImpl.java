package com.weikun.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.vo.Cart;
import com.weikun.vo.Category;
import com.weikun.vo.Item;
import com.weikun.vo.Orders;
import com.weikun.vo.Product;

public class CartDAOImpl implements ICartDAO {
	private DruidPooledConnection conn;
	public CartDAOImpl(){
		conn=DB.getConnection();
	}
	public int getMaxLinenum(int orderid){		
		int count=0;
		String sql="select max(linenum) from cart where orderid=?";
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, orderid);
			rs=pstmt.executeQuery();
			if(rs.next()){
				count=rs.getInt(1);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		return count+1;
	}
	private int getMaxOrderid(){
		
		int count=0;
		String sql="select max(orderid) from orders where orderdate is not null";
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()){
				count=rs.getInt(1);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		return count+1;
	}
	private Cart queryItem(Cart cart) {
		
		PreparedStatement pstmt=null;
		String sql="select * from cart c where c.orderid=? and c.itemid=?";
		ResultSet rs=null;
		Cart c=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, cart.getOrders().getOrderid());
			pstmt.setString(2, cart.getItem().getItemid());
			rs=pstmt.executeQuery();
			if(rs.next()){
				c=new Cart();
				Orders o=new Orders();
				o.setOrderid(rs.getInt("orderid"));
				
				c.setOrders(o);
				c.setLinenum(rs.getInt("linenum"));
				c.setQuantity(rs.getInt("quantity"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		return c;
		
	}
	public  List<Cart> updateCart(Cart cart) {
		boolean flag=false;
		
		String sql="update Cart set quantity=? where orderid=? and linenum=?";
		PreparedStatement pstmt=null;
		
		List<Cart> list=null;
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,cart.getQuantity());//新数量
			pstmt.setInt(2, cart.getOrders().getOrderid());
			pstmt.setInt(3,cart.getLinenum());
		
			
			
			list=pstmt.executeUpdate()>0?list=this.queryCart(cart.getOrders().getOrderid()):null;
				
				
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}
	@Override
	public List<Cart> addCart(Cart cart) {
		// TODO Auto-generated method stub
		String sql=null;
		Orders o=new Orders();
		o.setOrderid(getMaxOrderid());//把最大的orderid送入到该对象中 之后做查询
		cart.setOrders(o);
		Cart oldc=queryItem(cart);
		List<Cart> list=null;
		if(oldc!=null){//代表同一订单下有同样的商品
			cart.setQuantity(oldc.getQuantity()+cart.getQuantity());//老商品的数量+新商品的数量
			cart.setLinenum(oldc.getLinenum());
			return this.updateCart(cart);//修改			
		}else{//新商品
			sql="insert into Cart(orderid,linenum,itemid,quantity) "
					+ "values(?,?,?,?);";
			PreparedStatement pstmt=null;
			try {
				//增加
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, cart.getOrders().getOrderid());
				pstmt.setInt(2, this.getMaxLinenum(cart.getOrders().getOrderid()));
				pstmt.setString(3,cart.getItem().getItemid());
				pstmt.setInt(4, cart.getQuantity());
				
				
				if(pstmt.executeUpdate()>0?true:false){
					
					list=this.queryCart(cart.getOrders().getOrderid());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				try {
					
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		
		
		
		
		return list;
	}
	
	private List<Cart> queryCart(int orderid) {
		// TODO Auto-generated method stub

		String sql="select * from cart c,item i,product p ,category c1  "+
					" where orderid=? and "+
				     " c.itemid=i.itemid and "+
				      " i.productid=p.productid and "+
				     " p.category=c1.catid "
				     + " order by linenum ";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Cart> list=new ArrayList<Cart>();
		try {	
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, orderid);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				Category ca=new Category();			
				
				
				
				ca.setCatid(rs.getString("c1.catid"));
				ca.setDescn(rs.getString("c1.descn"));
				ca.setName(rs.getString("c1.name"));
				
				
				Product p=new Product();
				p.setDescn(rs.getString("p.descn"));
				p.setName(rs.getString("p.name"));
				p.setProductid(rs.getString("p.productid"));
				p.setCategory(ca);
				
				Item i=new Item();
				i.setProduct(p);
				i.setItemid(rs.getString("i.itemid"));
				i.setAttr1(rs.getString("i.attr1"));
				i.setListprice(rs.getFloat("i.listprice"));
				i.setUnitcost(rs.getFloat("i.unitcost"));
				
				
				Cart c=new Cart();
				
				Orders o=new Orders();
				o.setOrderid(rs.getInt("c.orderid"));
				c.setItem(i);
				c.setLinenum(rs.getInt("c.linenum"));
				c.setQuantity(rs.getInt("c.quantity"));
				c.setOrders(o);
				
				list.add(c);//多个cart
			}
				
				
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return list;
	}

}
