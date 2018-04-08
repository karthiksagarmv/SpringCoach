package com.sagar.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String [] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(thecoach +"\n" + alphaCoach);
		System.out.println(thecoach == alphaCoach);
		
		context.close();
	}
}
