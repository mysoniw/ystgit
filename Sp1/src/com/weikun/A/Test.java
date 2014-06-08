package com.weikun.A;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource res=new ClassPathResource("applicationContext.xml") ;
//		BeanFactory bf=new XmlBeanFactory(res);
//		JavaCouse jc=(JavaCouse)bf.getBean("course");
//		jc.javaCourse();
		
		
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		JavaCouse jc=(JavaCouse)ctx.getBean("course");
//		jc.javaCourse();
		
		
		

		ApplicationContext ctx=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		
		JavaCouse jc=(JavaCouse)ctx.getBean("course");
		jc.javaCourse();
		
	}

}
