package com.app.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		@SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setEmpName("ABC");
		emp.setEmpSal(12.36);
		
		ses.save(emp);
		tx.commit();
		ses.close();
		System.out.println("Record Inserted Successfully");
	}

}
