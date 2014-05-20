package com.weikun.dao;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.weikun.po.Father;
import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Son;

public class FatherDAO {
	public static void main(String[] args) {
		FatherDAO f=new FatherDAO();
		Set<Son>s=f.query();
		Iterator  <Son>it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getSname());
		}
	}
	public Set<Son> query(){
		Session session=HibernateSessionFactory.getSession();
		Set <Son> s=null;
		try {
			Father f=(Father)session.load(Father.class, 1);
			s=f.getSons();
			if(!Hibernate.isInitialized(s)){
				Hibernate.initialize(s);
			}


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return s;

	}
	public void queryS(){

	}

}
