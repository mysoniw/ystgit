package com.weikun.dao;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.Father;
import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Son;
import com.weikun.po.Wife;

public class FatherDAO {
	public static void main(String[] args) {
		new FatherDAO().del();
	}
	public void del(){
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			trans.begin();
			Father f=(Father)session.load(Father.class,1);
			
			session.delete(f);
			trans.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	public void query(){
		
		try {
			Session session=HibernateSessionFactory.getSession();
		
			
			
		
			
			
		
			Father f=(Father)session.load(Father.class,1);
			
			Iterator<Son> it=f.getSons().iterator();
			while(it.hasNext()){
				System.out.println(it.next().getSname());
			}
			
		
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
		
		
	}
	public void update(){
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			
			
		
			
			
			trans.begin();
			Father f=(Father)session.load(Father.class,1);
			f.setFname("ROSE");
			Iterator<Son> it=f.getSons().iterator();
			while(it.hasNext()){
				it.next().setSname("JAVA");
			}
			
			session.update(f);
			trans.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	public void add(){
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			
			Father f=new Father();
			
			f.setFid(1);
			f.setFname("Dad");
			Son son=new Son();
			
			son.setSid(1);;
			son.setSname("MIKE");
			son.setFather(f);
			
			Son son1=new Son();
			
			son1.setSid(2);;
			son1.setSname("JACK");
			son1.setFather(f);
			
			f.getSons().add(son);
			f.getSons().add(son1);
			
			
			
			trans.begin();
			session.save(f);
			
			trans.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
}
