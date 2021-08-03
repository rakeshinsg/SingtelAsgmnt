package com.singtel.impl;

import com.singtel.Flyable;
import com.singtel.Singable;

public class Parrot implements Singable, Flyable{
	
	public void sing(String sound) {
		System.out.println(sound);
	}

	@Override
	public void fly() {
		System.out.println("Parrot can fly");
	}
}
