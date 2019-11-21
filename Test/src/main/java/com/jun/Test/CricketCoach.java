package com.jun.Test;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService; 
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method -emailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -setTeam");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -fortuneService");
		this.fortuneService = fortuneService;
	}



	public String getDailyWorkout() {
		
		return "Practice fast bowling";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
