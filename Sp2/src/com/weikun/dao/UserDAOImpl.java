package com.weikun.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.weikun.po.User;

public class UserDAOImpl extends HibernateDaoSupport implements IUserDAO {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAOImpl dao=(UserDAOImpl)ctx.getBean("userdao");
		dao.query();
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		User user=new User();
		user.setUsername("≈À¿ˆ");
		user.setPassword("119");
		user.setAge(100);
		this.getHibernateTemplate().save(user);
		System.out.println("ok");
	}

	@Override
	public void query() {
		// TODO Auto-generated method stub
		List<User> list=this.getHibernateTemplate().find("from User   as u where u.username=?","≈À¿ˆ");
		
		Iterator<User> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getUsername());
		}
		
		
	}

}
