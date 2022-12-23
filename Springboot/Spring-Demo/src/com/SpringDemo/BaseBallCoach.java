package com.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseBallCoach implements ICoach {
	
	// define a private field for Service used a imterface
	@Autowired
	private IFortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseBallCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyworkOut() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
