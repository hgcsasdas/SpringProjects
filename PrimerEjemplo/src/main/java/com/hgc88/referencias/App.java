package com.hgc88.referencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hgc88.referencias.EmailService;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludador = null;
		
		saludador = appContext.getBean(Saludator.class);
				
		System.out.println(saludador.saludo() + "\n\n");
		
		EmailService emailService = null;
		
		emailService = appContext.getBean(EmailService.class);
		
		emailService.enviarEmailSaludo("pepe@gmail.com");
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}