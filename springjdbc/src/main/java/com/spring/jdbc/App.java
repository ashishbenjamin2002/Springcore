package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entities.Employee;

public class App {
	public static void main( String[]args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		EmpDao cd=c.getBean("EmpDao",EmpDao.class);
		
		//Employee c1=new Employee();
		//c1.setEid(101);
		//c1.setEname("Ashish Benjamin");
		//c1.setDname("Marketing");
		//int r=cd.insert(c1);
		
		//System.out.println("Record inserted"+r);
		
		
		//Employee c1=new Employee();
		//c1.setEid(101);
		//c1.setEname("Ashish Benjamin");
	
		//int w=cd.update(c1);
		
		//System.out.println("Record updated"+w);
		
		
		//Employee c11=new Employee();
		//c11.setEid(101);
	
		//int d=cd.delete(c11);
		
		//System.out.println("Record deleted"+d);
		
		Employee c1=cd.getEmployee(102);
		System.out.println(c1);
		
		List<Employee> employee=EmpDao.getAllEmployee();
		for(Employee c2:employee)
		{
			System.out.println(c2)
		}
		
		
		
	}

}
