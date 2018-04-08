package com.sagar.springlearning;

import java.util.Random;

public class TableTennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TableTennisCoach(FortuneService fortuneservice) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise forehand and back hand services";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void init() {
		System.out.println("TableTennis : init method");
	}
	
	public void destroy() {
		System.out.println("TableTennis : destroy method");
	}

}
