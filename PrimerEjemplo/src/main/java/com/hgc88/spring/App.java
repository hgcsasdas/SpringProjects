package com.hgc88.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
