package com.sagar.springlearning;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String [] fortunes = {
		"You will meet a lucky girl today",
		"You will be calm and peaceful today",
		"you need to work hard as well as smart"
	}
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = random.nextInt(3);
		return fortunes[index];
	}

}
