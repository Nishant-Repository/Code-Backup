package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
	
	public static void main(String args[]) { 
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	CricketCoach theCricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
	
	
	context.close();
	}
}
