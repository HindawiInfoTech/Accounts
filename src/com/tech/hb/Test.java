package com.tech.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
		System.out.println("1111");
		Configuration cfg = new  Configuration();
		System.out.println("222");
		cfg.configure("hibernate-cfg.xml");
		System.out.println("333");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		System.out.println("444");
		
		Session session= sessionFactory.openSession();
		Employee ee1 = new Employee();
		ee1.setId(1);
		ee1.setName("aaa");
		ee1.setEmail("aaa@gmail.com");
		
		session.save(ee1);
		
		session.beginTransaction().commit();
	}
}
