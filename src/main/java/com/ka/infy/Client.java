package com.ka.infy;
import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Client {

	public static void main(String[] args) {
		
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;


	  try {
		  tx= session.beginTransaction();
		
		  Course c1 = new Course(201, "JAVA");
		  Course c2 = new Course(202, "SPRINGBOOT");
		  Course c3 = new Course(203, "HIBERNATE");
		  
		
		   List<Course> courseList = new ArrayList<>();
           courseList.add(c1);
           courseList.add(c2);
           courseList.add(c3);
           
           Certification cert1 = new Certification(301, "JAVA CERTIFIED", "12-SEP-2024", "Backend course for Bengineer");
           Certification cert2 = new Certification(302, " Springboot  CERTIFIED", "15-SEP-2024", "Backend course for Expert");
           
           List <Certification> CertificateList= new ArrayList<>();
           CertificateList.add(cert1);
           CertificateList.add(cert2);
           
           Student s1 = new Student(101, "Rushikesh", courseList, CertificateList);
           Student s2 = new Student(102, "Neha", courseList, CertificateList);

           session.save(s1);
           session.save(s2);
           
           
           tx.commit();

           
           

		 
	

		 
		  
		
	} catch (Exception e) {
		tx.rollback();
		e.printStackTrace();// TODO: handle exception
		
	} finally {
		session.close();
		sessionFactory.close();
	}
	  
	
		
	}
}
