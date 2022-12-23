package com.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCofigDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		CricketCoach trackcoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// call method of the bean
		System.out.println(trackcoach.getDailyworkOut());
		
		System.out.println(trackcoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
