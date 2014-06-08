package com.weikun.dao;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.po.Cart;
import com.weikun.po.CartId;
import com.weikun.po.Category;
import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Item;
import com.weikun.po.Orders;
import com.weikun.po.Product;

public class CartDAOImpl implements ICartDAO {
	private DruidPooledConnection conn;
	public CartDAOImpl(){
		//conn=DB.getConnection();
	}
//	public int getMaxLinenum(int orderid){		
//		int count=0;
//		String sql="select max(linenum) from cart where orderid=?";
//		
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1, orderid);
//			rs=pstmt.executeQuery();
//			if(rs.next()){
//				count=rs.getInt(1);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally{
//			
//			try {
//				rs.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//		
//		
//		return count+1;
//	}
	
	public int getMaxLinenum(int orderid){		
		int count=0;
		try {
			Session session=HibernateSessionFactory.getSession();
			
			Query query=session.createQuery(""
					+ "from Cart as c where c.id.orders.orderid=:p1 order by c.id.linenum desc");
			query.setBigDecimal("p1",new BigDecimal(orderid));
			List<Cart> list=query.list();
			if(!list.isEmpty()){
				count=Integer.parseInt(list.get(0).getId().getLinenum().toString());
			}			
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			
			
		}
		return count+1;
		
		
	}
//	private int getMaxOrderid(){
//		
//		int count=0;
//		String sql="select max(orderid) from orders where orderdate is not null";
//		
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		try {
//			pstmt=conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			if(rs.next()){
//				count=rs.getInt(1);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally{
//			
//			try {
//				rs.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//		
//		
//		return count+1;
//	}
	private BigDecimal getMaxOrderid(){
		int count=0;
		try {
			Session session=HibernateSessionFactory.getSession();
			
			Query query=session.createQuery(
					 "from Orders as o where o.orderdate is not null order by o.orderid desc ");
			List<Orders> list=query.list();
			if(!list.isEmpty()){
				count=Integer.parseInt(list.get(0).getOrderid().toString());
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			
			
		}
		return new BigDecimal(count+1);
		
	}
	private Cart queryItem(Cart cart) {
		Cart c=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			
			Query query=session.createQuery("from Cart as c "
					+ "where c.id.orders.orderid=:p1 and c.item.itemid=:p2");
			query.setBigDecimal("p1", cart.getId().getOrders().getOrderid());
			query.setString("p2", cart.getItem().getItemid());
			List<Cart> list=query.list();
			if(!list.isEmpty()){
				c=list.get(0);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			
			
		}
		return c;
	}
//	private Cart queryItem(Cart cart) {
//		
//		PreparedStatement pstmt=null;
//		String sql="select * from cart c where c.orderid=? and c.itemid=?";
//		ResultSet rs=null;
//		Cart c=null;
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1, cart.getOrders().getOrderid());
//			pstmt.setString(2, cart.getItem().getItemid());
//			rs=pstmt.executeQuery();
//			if(rs.next()){
//				c=new Cart();
//				Orders o=new Orders();
//				o.setOrderid(rs.getInt("orderid"));
//				
//				c.setOrders(o);
//				c.setLinenum(rs.getInt("linenum"));
//				c.setQuantity(rs.getInt("quantity"));
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally{
//			try {
//				rs.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		
//		
//		return c;
//		
//	}
	public  List<Cart> updateCart(Cart cart) {
		Transaction trans=null;
		List<Cart>  list=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			
			trans=session.beginTransaction();
			Cart c=(Cart)session.load(Cart.class, cart.getId());
			c.setQuantity(cart.getQuantity());
			trans.begin();
			session.update(c);
			
			trans.commit();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
			
		}
		list=this.queryCart(cart.getId().getOrders().getOrderid());
		return list;
		
	}
//	public  List<Cart> updateCart(Cart cart) {
//		boolean flag=false;
//		
//		String sql="update Cart set quantity=? where orderid=? and linenum=?";
//		PreparedStatement pstmt=null;
//		
//		List<Cart> list=null;
//		try {
//			
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1,cart.getQuantity());//新数量
//			pstmt.setInt(2, cart.getOrders().getOrderid());
//			pstmt.setInt(3,cart.getLinenum());
//		
//			
//			
//			list=pstmt.executeUpdate()>0?list=this.queryCart(cart.getOrders().getOrderid()):null;
//				
//				
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally{
//			try {
//				
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		return list;
//	}
	public List<Cart> addCart(Cart cart,String username) {
		
		Orders o=new Orders();
		o.setOrderid(this.getMaxOrderid());//把最大的orderid送入到该对象中 之后做查询
		CartId id=new CartId();
		
		id.setOrders(o);
		
		cart.setId(id);
		
		
		
		Cart oldc=queryItem(cart);
		List<Cart> list=null;
		if(oldc!=null){//代表同一订单下有同样的商品
			cart.setQuantity(oldc.getQuantity().add(cart.getQuantity()));//老商品的数量+新商品的数量
			cart.getId().setLinenum(oldc.getId().getLinenum());
			return this.updateCart(cart);//修改			
		}else{//新商品
			Transaction trans=null;
			try {
				//增加
				Session session=HibernateSessionFactory.getSession();
				trans=session.beginTransaction();
				
				trans.begin();
				
				cart.getId().setLinenum(new BigDecimal(this.getMaxLinenum(cart.getId().getOrders().getOrderid().intValue())));
				
				cart.getId().setOrders(o);
				
				o.setUserid(username);
				o.getCarts().add(cart);
			
				
				session.merge(o);
				
			
				
				
				
				trans.commit();
				
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				trans.rollback();
			}finally{
				HibernateSessionFactory.closeSession();
			}
			
		}
		
		
		list=this.queryCart(cart.getId().getOrders().getOrderid());	
		
		
		
		return list;
		
	}
//	@Override
//	public List<Cart> addCart(Cart cart) {
//		// TODO Auto-generated method stub
//		String sql=null;
//		Orders o=new Orders();
//		o.setOrderid(getMaxOrderid());//把最大的orderid送入到该对象中 之后做查询
//		cart.setOrders(o);
//		Cart oldc=queryItem(cart);
//		List<Cart> list=null;
//		if(oldc!=null){//代表同一订单下有同样的商品
//			cart.setQuantity(oldc.getQuantity()+cart.getQuantity());//老商品的数量+新商品的数量
//			cart.setLinenum(oldc.getLinenum());
//			return this.updateCart(cart);//修改			
//		}else{//新商品
//			sql="insert into Cart(orderid,linenum,itemid,quantity) "
//					+ "values(?,?,?,?);";
//			PreparedStatement pstmt=null;
//			try {
//				//增加
//				pstmt=conn.prepareStatement(sql);
//				pstmt.setInt(1, cart.getOrders().getOrderid());
//				pstmt.setInt(2, this.getMaxLinenum(cart.getOrders().getOrderid()));
//				pstmt.setString(3,cart.getItem().getItemid());
//				pstmt.setInt(4, cart.getQuantity());
//				
//				
//				if(pstmt.executeUpdate()>0?true:false){
//					
//					list=this.queryCart(cart.getOrders().getOrderid());
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}finally{
//				try {
//					
//					pstmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//		}
//		
//		
//		
//		
//		
//		
//		
//		return list;
//	}
//	
	private List<Cart> queryCart(BigDecimal orderid) {
		List<Cart>  list=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			Orders o=(Orders)session.get(Orders.class, orderid);
			Set <Item>set=o.getCarts();
			
			list=Arrays.asList(set.toArray(new Cart[]{}));	
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
		
		return list;
	}
//	private List<Cart> queryCart(int orderid) {
//		// TODO Auto-generated method stub
//
//		String sql="select * from cart c,item i,product p ,category c1  "+
//					" where orderid=? and "+
//				     " c.itemid=i.itemid and "+
//				      " i.productid=p.productid and "+
//				     " p.category=c1.catid "
//				     + " order by linenum ";
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		List<Cart> list=new ArrayList<Cart>();
//		try {	
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1, orderid);
//			rs=pstmt.executeQuery();
//			
//			while(rs.next()){
//				Category ca=new Category();			
//				
//				
//				
//				ca.setCatid(rs.getString("c1.catid"));
//				ca.setDescn(rs.getString("c1.descn"));
//				ca.setName(rs.getString("c1.name"));
//				
//				
//				Product p=new Product();
//				p.setDescn(rs.getString("p.descn"));
//				p.setName(rs.getString("p.name"));
//				p.setProductid(rs.getString("p.productid"));
//				p.setCategory(ca);
//				
//				Item i=new Item();
//				i.setProduct(p);
//				i.setItemid(rs.getString("i.itemid"));
//				i.setAttr1(rs.getString("i.attr1"));
//				i.setListprice(rs.getFloat("i.listprice"));
//				i.setUnitcost(rs.getFloat("i.unitcost"));
//				
//				
//				Cart c=new Cart();
//				
//				Orders o=new Orders();
//				o.setOrderid(rs.getInt("c.orderid"));
//				c.setItem(i);
//				c.setLinenum(rs.getInt("c.linenum"));
//				c.setQuantity(rs.getInt("c.quantity"));
//				c.setOrders(o);
//				
//				list.add(c);//多个cart
//			}
//				
//				
//				
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally{
//			try {
//				rs.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		return list;
//	}
	
}
