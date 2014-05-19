package com.weikun.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.Animal;
import com.weikun.po.AnimalId;
import com.weikun.po.HibernateSessionFactory;

public class AnimalDAOImpl {
	public static void main(String[] args) {
		new AnimalDAOImpl().update();
	}
	public void update(){
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		
		try {
			trans=session.beginTransaction();
			trans.begin();
		
			
			AnimalId aid=new AnimalId();
			aid.setAno((short)6);
			aid.setAid((short)1);
			
			Animal a=(Animal)session.load(Animal.class, aid);
			a.setAname("ÀÇ");
			session.update(a);
			trans.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	public void del(){
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		
		try {
			trans=session.beginTransaction();
			trans.begin();
		
			
			AnimalId aid=new AnimalId();
			aid.setAno((short)8);
			aid.setAid((short)9);
			
			Animal a=(Animal)session.load(Animal.class, aid);
			session.delete(a);
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
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		
		try {
			trans=session.beginTransaction();
			trans.begin();
			Animal a =new Animal ();
			a.setAname("¹·");
			a.setAsex("ÐÛ");
			AnimalId aid=new AnimalId();
			aid.setAno((short)8);
			aid.setAid((short)9);
			a.setId(aid);
			
			session.save(a);
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
