package com.sc.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/sc/collection/config.xml");
		Std s1=(Std)context.getBean("e1");
		System.out.println(s1.getName());
		System.out.println(s1.getPhone());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCourses());
		

	}

}
