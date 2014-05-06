package com.weikun.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

public class DB {
	public static DruidPooledConnection getConnection(){
		DruidPooledConnection conn=null;
		
		try {
			conn= (DruidPooledConnection)(DruidDataSourceFactory.createDataSource(loadDBFile()).getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	private static  Properties loadDBFile(){		
		InputStream is=DB.class.getClassLoader().getResourceAsStream("properties/database.properties");
		Properties pro=new Properties();
		try {
			pro.load(is);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pro;
		
		
	}
}
