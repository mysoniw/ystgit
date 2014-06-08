package com.weikun.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.weikun.vo.User;
import com.weikun.vo.UserRowpper;

public class UserDAOImpl extends JdbcDaoSupport implements IUserDAO {
	
	
	public void add() {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("insert into user(username,password) "
				+ "values(?,?)", new PreparedStatementSetter(){

					@Override
					public void setValues(PreparedStatement arg0)
							throws SQLException {
						// TODO Auto-generated method stub
						arg0.setString(1, "Œ‚»Û∫∆");
						arg0.setString(2, "119");
						
					}
					
					
					
					
				}) ;
	}
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAOImpl dao=(UserDAOImpl)ctx.getBean("userdao");
		dao.query();
		
	}

	@Override
	public void query() {
		// TODO Auto-generated method stub
		List<User> list=this.getJdbcTemplate().query("select * from user where id=?", new Object[]{1132} , 
				new UserRowpper() );
		Iterator<User> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getUsername());
		}
		
	}

}
