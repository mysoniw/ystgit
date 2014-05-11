package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.DB;
import com.weikun.vo.Account;

public class UserDAOImpl implements IUserDAO {
	private DruidPooledConnection conn=null;
	public UserDAOImpl(){
		conn=DB.getConnection();
		
	}
	@Override
	public boolean login(Account account) {
		// TODO Auto-generated method stub
		String sql="select * from account where username='"+account.getUsername()+
				"' and password='"+ account.getPassword()+"'";
		boolean flag=false;
		try(PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();) {
			
			
			
			if(rs.next()){
				flag=true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return flag;
	}
	
	private boolean addP(Account account) {
		String sql="insert into profile (username,langpref,favcategory) "
				+ "values(?,?,?)";
		PreparedStatement pstmt=null;
		boolean flag=false;
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getUsername());
			pstmt.setString(2, account.getProfile().getLangpref());
			pstmt.setString(3, account.getProfile().getCate().getCatid());
			
			flag=pstmt.executeUpdate()>0?true:false;
			
			
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
		return flag;
		
	}
	@Override
	public boolean addA(Account account) {
		// TODO Auto-generated method stub
		String sql="insert into Account (username,password,xm,address,email) "
				+ "values(?,?,?,?,?)";
		PreparedStatement pstmt=null;
		boolean flag=false;
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getUsername());
			pstmt.setString(2, account.getPassword());
			pstmt.setString(3, account.getXm());
			pstmt.setString(4, account.getAddress());
			pstmt.setString(5, account.getEmail());

			flag=pstmt.executeUpdate()>0?this.addP(account):false;
				
			
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
		return flag;
	}

}
