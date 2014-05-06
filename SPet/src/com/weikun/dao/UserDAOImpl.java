package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		String sql="select * from account where username=? and password=?";
		boolean flag=false;
		try(PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();) {
			
			pstmt.setString(1, account.getUsername());
			pstmt.setString(2, account.getPassword());
			
			if(rs.next()){
				flag=true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return flag;
	}

}
