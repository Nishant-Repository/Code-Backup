package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		ICoach trackcoach = context.getBean("trackCoach", ICoach.class);
		
		// call method of the bean
		System.out.println(trackcoach.getDailyworkOut());
		
		System.out.println(trackcoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
