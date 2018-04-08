package com.sagar.springlearning;

public class BaseballCoach implements Coach {

private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneservice) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Push ups for 30 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
