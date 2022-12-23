package com.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.SpringDemo")
public class CricketCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside Cricket : No arg constructor");
	}
	// setter method	
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("Inside Setter method : setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyworkOut() {
		return "Practice fast bowling.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
