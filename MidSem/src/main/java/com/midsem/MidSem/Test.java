package com.midsem.MidSem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.midsem.MidSem.*;

public class Test {
	
		private static ApplicationContext context;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			context = new ClassPathXmlApplicationContext("com/midsem/MidSem/Student");
			context = new ClassPathXmlApplicationContext("com/midsem/MidSem/Fees");
			Student s1=(Student)context.getBean("s1");
			Fees s2=(Fees)context.getBean("s2");
			System.out.println(s1.getSname());
			System.out.println(s1.getRoll());
			System.out.println(s1.getCourse());
			System.out.println(s2.getAmount());
			System.out.println(s2.getPaymode());
			
			

		}

	}

}
