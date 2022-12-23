package com.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements ICoach{
	@Override
	public String getDailyworkOut() {
		return "Run Hard 5km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
