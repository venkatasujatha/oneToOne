package com.tectoro.HibernateFirst;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MapDemo {

	public static void main(String[] args) 
	{
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory sessionFactory = cfg.buildSessionFactory();
	       Session session = sessionFactory.openSession();
	       System.out.println(sessionFactory);
	       System.out.println(sessionFactory.isClosed());
	       //create Employee object
	       Employee emp = new Employee();
	       emp.setId(2);
	       emp.setName("bharathi");
	       Employee emp1 = new Employee();
	       emp.setId(3);
	       emp.setName("chinni");
	       
	       
	       //create company object
	       Company com=new Company();
	       com.setId(1);
	       com.setName("tectoro");
	       com.setLocation("Hyderabad");
	       
	       Transaction tx = session.beginTransaction();
	       com.setEmpid(emp);
	       com.setEmpid(emp1);
	       session.save(com);
	       
	       
	       
	       	       
	       tx.commit();
	       session.close();
	       sessionFactory.close();

	}

}
