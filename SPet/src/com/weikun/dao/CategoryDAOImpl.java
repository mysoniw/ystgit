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

public class CategoryDAOImpl implements ICategoryDAO {
	private DruidPooledConnection conn;
	public CategoryDAOImpl(){
		
		//conn=DB.getConnection();
	}
//	@Override
//	public List<Category> queryC() {
//		// TODO Auto-generated method stub
//		String sql="select * from Category ";
//		PreparedStatement pstmt=null;
//		List<Category> list=new ArrayList<Category>();
//		ResultSet rs=null;
//		try {
//			pstmt=conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			while(rs.next()){
//				Category c=new Category();
//				c.setCatid(rs.getString("catid"));
//				c.setName(rs.getString("name"));
//				c.setDescn(rs.getString("descn"));
//				
//				list.add(c);;
//				
//				
//			}
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
//		}
//		
//		
//		return list;
//	}
	public List<Category> queryC() {
		// TODO Auto-generated method stub
		List<Category>  list=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			
			Query query=session.createQuery("from Category as c");
			list=query.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
		
		return list;
	}
}
