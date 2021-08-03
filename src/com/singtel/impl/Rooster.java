package com.singtel.impl;

import com.singtel.Animal;

public class Rooster implements Animal{
	
	private Chicken chicken;
	
	public Rooster(Chicken chicken) {
		this.chicken = chicken;
	}

	public void sing(String sound) {
		chicken.sing(sound);
	}
}
