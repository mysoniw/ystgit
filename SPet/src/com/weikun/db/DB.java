package com.weikun.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

public class DB {
//	private static DruidDataSource ds=null;
////	static{
////		try {
////			
////			ds=(DruidDataSource)DruidDataSourceFactory.createDataSource(loadDBFile());
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		
////	}
//	
//	public static  DruidPooledConnection getConnection(){
//		DruidPooledConnection conn=null;
//		
//		try {
//			conn= (DruidPooledConnection)ds.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return conn;
//	}
//	public static void main(String[] args) {
//		new DB().getConnection();
//	}
//	private static  Properties loadDBFile(){		
//		InputStream is=DB.class.getClassLoader().getResourceAsStream("properties/database.properties");
//		Properties pro=new Properties();
//		try {
//			pro.load(is);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return pro;
//		
//		
//	}
}
