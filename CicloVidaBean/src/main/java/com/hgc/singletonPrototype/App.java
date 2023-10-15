package com.hgc.singletonPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
 		
		EmailService emailService1 = appContext.getBean(EmailService.class);
		EmailService emailService2 = appContext.getBean(EmailService.class);


		System.out.println(emailService1);
		System.out.println(emailService2);
		
		((ClassPathXmlApplicationContext) appContext).close();

		

	}

}