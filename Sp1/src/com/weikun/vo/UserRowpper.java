package com.weikun.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowpper implements RowMapper {

	@Override
	public User mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		User user=new User();
		
		user.setUsername(arg0.getString("username"));
		user.setPassword(arg0.getString("password"));
		
		return user;
	}

}
