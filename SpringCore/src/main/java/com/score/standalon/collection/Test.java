package com.score.standalon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/score/standalon/collection/config.xml");
		Employee p1=(Employee)context.getBean("emp1");
		System.out.println(p1.getEname());
		

	}

}
