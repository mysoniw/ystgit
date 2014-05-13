package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.vo.Category;
import com.weikun.vo.Item;
import com.weikun.vo.Product;

public class ItemDAOImpl implements IItemDAO {
	private DruidPooledConnection conn;
	public ItemDAOImpl(){
		conn=DB.getConnection();
		
	}
	@Override	
	public List<Item> queryC(Product product) {
		// TODO Auto-generated method stub		
		String sql="select * from Product p ,Category c,Item i "
				+ " where p.productid=? "
				+" and p.category=c.catid and p.productid=i.productid;";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Item> list=new ArrayList<Item>();
		try {	
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductid());
			rs=pstmt.executeQuery();
			while(rs.next()){
				Category c=new Category();
				Item i=new Item();
				Product p=new Product();
				i.setItemid(rs.getString("i.itemid"));
				i.setAttr1(rs.getString("i.attr1"));
				i.setListprice(rs.getFloat("i.listprice"));
				i.setUnitcost(rs.getFloat("i.unitcost"));
				
				c.setCatid(rs.getString("c.catid"));
				c.setDescn(rs.getString("c.descn"));
				c.setName(rs.getString("c.name"));
				
				p.setDescn(rs.getString("p.descn"));
				p.setName(rs.getString("p.name"));
				p.setProductid(rs.getString("p.productid"));
				
				
				
				p.setCategory(c);
				i.setProduct(p);
				
				
				list.add(i);
				
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
	@Override
	public Item queryI(String itemid) {
		// TODO Auto-generated method stub
		
		String sql="select * from Product p ,Category c,Item i "
				+ " where i.itemid=? "
				+" and p.category=c.catid and p.productid=i.productid;";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Item i=new Item();
		try {	
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, itemid);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				Category c=new Category();
			
				Product p=new Product();
				i.setItemid(rs.getString("i.itemid"));
				i.setAttr1(rs.getString("i.attr1"));
				i.setListprice(rs.getFloat("i.listprice"));
				i.setUnitcost(rs.getFloat("i.unitcost"));
				
				c.setCatid(rs.getString("c.catid"));
				c.setDescn(rs.getString("c.descn"));
				c.setName(rs.getString("c.name"));
				
				p.setDescn(rs.getString("p.descn"));
				p.setName(rs.getString("p.name"));
				p.setProductid(rs.getString("p.productid"));
				
				
				
				p.setCategory(c);
				i.setProduct(p);
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
		
		return i;
	}

}
