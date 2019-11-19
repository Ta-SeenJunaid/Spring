package com.jun.Test;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	public String getDailyWorkout() {
		 return "Spend 46 minutes on batting";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
