package examination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("examination/config.xml");
		Question p1=(Question)context.getBean("e1");
		System.out.println(p1.getQuestions());
		
		

	}
}
