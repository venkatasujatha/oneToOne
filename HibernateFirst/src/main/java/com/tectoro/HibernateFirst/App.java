package com.tectoro.HibernateFirst;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sessionFactory = cfg.buildSessionFactory();
       Session session = sessionFactory.openSession();
       System.out.println(sessionFactory);
       System.out.println(sessionFactory.isClosed());
       Employee emp = new Employee();
       emp.setId(1);
       emp.setName("Sujatha");
       
       Transaction tx = session.beginTransaction();
       
       
       session.save(emp);
       tx.commit();
    }
}
