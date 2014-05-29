package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.po.Category;
import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Product;

public class ProductDAOImpl implements IProductDAO {
	private DruidPooledConnection conn;
	public ProductDAOImpl(){
		conn=DB.getConnection();
		
	}
	@Override
	public List<Product> queryC(Category category) {
		// TODO Auto-generated method stub
		
		List<Product> list=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			
			Query query=session.createQuery("from Product as p where p.category=:p1");
			query.setEntity("p1", category);
			
			list=query.list();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			
		}
		
		return list;
	}
//	@Override
//	public List<Product> queryC(Category category) {
//		// TODO Auto-generated method stub
//		String sql="select * from Product p ,"
//				+ "Category c where p.category=? "
//				+	"and p.category=c.catid ";
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		List<Product> list=new ArrayList<Product>();
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, category.getCatid());
//			rs=pstmt.executeQuery();
//			while(rs.next()){
//				Product p=new Product();
//				p.setProductid(rs.getString("productid"));
//				p.setName(rs.getString("name"));
//				
//				list.add(p);
//				
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
//		return list;
//	}

}
