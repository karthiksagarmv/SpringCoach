package com.sagar.springlearning;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneservice) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneservice;
	}
	
	public TrackCoach() {
		// yeah my no argument constructor
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Edu 5k run";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Yeeah lucky,lucky" + fortuneService.getFortune();
	}

	public void init() {
		System.out.println("Bean initialization db, file, sockets");
	}
	
	public void destroy() {
		System.out.println("Bean destrying, clean up db, file and sockets ");
	}
}
