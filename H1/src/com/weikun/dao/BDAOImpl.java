package com.weikun.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.B;
import com.weikun.po.HibernateSessionFactory;

public class BDAOImpl implements IBDAO {

	@Override
	public void add(B b) {
		// TODO Auto-generated method stub		
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			trans.begin();
			session.save(b);			
			
			trans.commit();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
			
		}
		
	}
	public static void main(String[] args) {
		B b=new B();
		b.setEId((byte)3);
		new BDAOImpl().query(b);
		
	}
	@Override
	public void del(B b) {
		// TODO Auto-generated method stub
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			Byte id=b.getEId();
			B b1=(B)session.load(B.class, id);
			
			trans.begin();
			session.delete(b1);			
			
			trans.commit();			
			System.out.println("Del ok");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
			
		}
	}
	public void query(B b) {
		
	
		try {
			Session session=HibernateSessionFactory.getSession();
			
			Byte id=b.getEId();
			B b1=(B)session.load(B.class, id);
			//B b1=(B)session.get(B.class, id);
			
			System.out.println(b1.getEName());	
			
		
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			HibernateSessionFactory.closeSession();
			
		}
	}
	@Override
	public void update(B b) {
		// TODO Auto-generated method stub
		Transaction trans=null;
		try {
			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();
			Byte id=b.getEId();
			B b1=(B)session.load(B.class, id);
			
			
			trans.begin();
			b1.setEName("JACK");
			session.update(b1);			
			
			trans.commit();			
			System.out.println("update ok");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
			
		}
	}

}
