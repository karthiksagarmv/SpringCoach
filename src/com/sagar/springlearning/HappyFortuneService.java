package com.sagar.springlearning;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String [] fortunes = {"lucky","enjoy","ossom" };
		Random random = new Random();
		return fortunes[random.nextInt(3)];
	}

}
