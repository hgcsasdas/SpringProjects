package com.casa.primerejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args, Saludator saludator) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        Saludator saludador = null;

        //1.- getBean con ID y casting:
        saludator = (Saludator) appContext.getBean("saludator");

        ((ClassPathXmlApplicationContext) appContext).close();
    }
}
