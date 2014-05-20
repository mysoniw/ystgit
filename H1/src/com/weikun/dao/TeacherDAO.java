package com.weikun.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Stu;
import com.weikun.po.Teacher;

public class TeacherDAO {
	public static void main(String[] args) {
		new TeacherDAO().del();
	}
	public void del(){		
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			trans.begin();
			Teacher t=(Teacher)session.load(Teacher.class, 4);
			session.delete(t);			
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
		Session session=HibernateSessionFactory.getSession();
	
		try {
			Teacher t=(Teacher)session.load(Teacher.class, 3);
			
			Object [] os=t.getStus().toArray();
			for(Object o :os){
				System.out.println(((Stu)o).getSname());
			}
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	public void update(){
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			
			
			trans.begin();
			Teacher t=(Teacher)session.load(Teacher.class, 3);
			t.setTname("魏老师");
			Object [] os=t.getStus().toArray();
			((Stu)os[0]).setSname("Anlisda");
			session.update(t);
			
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
			Teacher t1=new Teacher();
			t1.setTid(2);
			t1.setTname("李老师");
			
			Teacher t2=new Teacher();
			t2.setTid(3);
			t2.setTname("王老师");
			
			Stu s1=new Stu();
			s1.setSid(3);
			s1.setSname("MIKE");
			
			s1.getTeachers().add(t1);
			s1.getTeachers().add(t2);
			
			t1.getStus().add(s1);
			t2.getStus().add(s1);
			
			Stu s2=new Stu();
			s2.setSid(4);
			s2.setSname("ROSE");
			
			s2.getTeachers().add(t1);
			
			
			t1.getStus().add(s2);
			
			
			
			session.save(t1);
			session.save(t2);
			
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
