package com.sagar.springlearning;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Setting Email Address");
	}

	public CricketCoach() {
		System.out.println("Cricket coach constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowl 100 balls without break";
	}

	// This is setter based dependencyInjection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Setting Constructor");
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() + " Cricket Ground is yours";
	}

}
