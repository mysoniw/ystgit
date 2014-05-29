package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.po.Category;
import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Item;
import com.weikun.po.Product;

public class ItemDAOImpl implements IItemDAO {
	private DruidPooledConnection conn;
	public ItemDAOImpl(){
		conn=DB.getConnection();
		
	}
//	@Override	
//	public List<Item> queryC(Product product) {
//		// TODO Auto-generated method stub		
//		String sql="select * from Product p ,Category c,Item i "
//				+ " where p.productid=? "
//				+" and p.category=c.catid and p.productid=i.productid;";
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		List<Item> list=new ArrayList<Item>();
//		try {	
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, product.getProductid());
//			rs=pstmt.executeQuery();
//			while(rs.next()){
//				Category c=new Category();
//				Item i=new Item();
//				Product p=new Product();
//				i.setItemid(rs.getString("i.itemid"));
//				i.setAttr1(rs.getString("i.attr1"));
//				i.setListprice(rs.getFloat("i.listprice"));
//				i.setUnitcost(rs.getFloat("i.unitcost"));
//				
//				c.setCatid(rs.getString("c.catid"));
//				c.setDescn(rs.getString("c.descn"));
//				c.setName(rs.getString("c.name"));
//				
//				p.setDescn(rs.getString("p.descn"));
//				p.setName(rs.getString("p.name"));
//				p.setProductid(rs.getString("p.productid"));
//				
//				
//				
//				p.setCategory(c);
//				i.setProduct(p);
//				
//				
//				list.add(i);
//				
//			}
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			
//		}finally{
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
//		return list;
//	}
	@Override	
	public List<Item> queryC(Product product) {
		// TODO Auto-generated method stub		
		List<Item> list=null;
		try {	
			Session session=HibernateSessionFactory.getSession();
				
			Product p1=(Product)session.load(Product.class, product.getProductid());
			Set <Item>set=p1.getItems();
			
			list=Arrays.asList(set.toArray(new Item[]{}));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			
			HibernateSessionFactory.closeSession();
			
		}
		
		return list;
	}
//	@Override
//	public Item queryI(String itemid) {
//		// TODO Auto-generated method stub
//		
//		String sql="select * from Product p ,Category c,Item i "
//				+ " where i.itemid=? "
//				+" and p.category=c.catid and p.productid=i.productid;";
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		Item i=new Item();
//		try {	
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, itemid);
//			rs=pstmt.executeQuery();
//			
//			while(rs.next()){
//				Category c=new Category();
//			
//				Product p=new Product();
//				i.setItemid(rs.getString("i.itemid"));
//				i.setAttr1(rs.getString("i.attr1"));
//				i.setListprice(rs.getFloat("i.listprice"));
//				i.setUnitcost(rs.getFloat("i.unitcost"));
//				
//				c.setCatid(rs.getString("c.catid"));
//				c.setDescn(rs.getString("c.descn"));
//				c.setName(rs.getString("c.name"));
//				
//				p.setDescn(rs.getString("p.descn"));
//				p.setName(rs.getString("p.name"));
//				p.setProductid(rs.getString("p.productid"));
//				
//				
//				
//				p.setCategory(c);
//				i.setProduct(p);
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
//		return i;
//	}
	@Override
	public Item queryI(String itemid) {
		// TODO Auto-generated method stub
		Item i=null;
		
		try {	
			Session session=HibernateSessionFactory.getSession();
			i=(Item)session.load(Item.class, itemid);
				
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			HibernateSessionFactory.closeSession();
		}
		
		return i;
	}

}
