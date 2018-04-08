package com.sagar.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String [] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach mycoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(mycoach.getDailyWorkout() + " \n" + mycoach.getDailyFortune() +"\n" + mycoach.getEmailAddress());
		
		context.close();
		
	}
}
