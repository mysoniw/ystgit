package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.vo.Category;
import com.weikun.vo.Product;

public class ProductDAOImpl implements IProductDAO {
	private DruidPooledConnection conn;
	public ProductDAOImpl(){
		conn=DB.getConnection();
		
	}
	@Override
	public List<Product> queryC(Category category) {
		// TODO Auto-generated method stub
		String sql="select * from Product p ,"
				+ "Category c where p.category=? "
				+	"and p.category=c.catid ";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Product> list=new ArrayList<Product>();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, category.getCatid());
			rs=pstmt.executeQuery();
			while(rs.next()){
				Product p=new Product();
				p.setProductid(rs.getString("productid"));
				p.setName(rs.getString("name"));
				
				list.add(p);
				
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
