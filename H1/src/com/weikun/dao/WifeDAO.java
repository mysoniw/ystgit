package com.weikun.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Husband;
import com.weikun.po.Wife;

public class WifeDAO {
	public static void main(String[] args) {
		new WifeDAO().del();
	}
	void del(){
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			
			
			trans.begin();
			Wife w=(Wife)session.load(Wife.class, 1l);
			session.delete(w);
			
			trans.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	void query(){
		
		try {
			Session session=HibernateSessionFactory.getSession();
			
			
		
			Wife w=(Wife)session.load(Wife.class, 1l);
			System.out.println(w.getHusband().getHname());
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	void update(){
		
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			
			
			trans.begin();
			Wife w=(Wife)session.load(Wife.class, 1l);
			w.setWname("“¬≥¨");
			w.getHusband().setHname("¡ı≈Ùª‘");
			session.update(w);
			
			trans.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	void add(){
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			
			
			trans.begin();
			Wife wife=new Wife();
			wife.setId(1);
			wife.setWname("¡ı“‡∑∆");
			Husband hus=new Husband();
			
			hus.setHname("“¬≥¨");
			hus.setId(1);
			hus.setWife(wife);
			wife.setHusband(hus);
			session.save(wife);
			
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
