package com.singtel.impl;

import com.singtel.Flyable;
import com.singtel.Singable;
import com.singtel.Swimable;

public class Duck implements Singable, Swimable, Flyable {

	@Override
	public void swim() {
		System.out.println("Duck is swiming");
	}

	@Override
	public void sing(String sound) {
		System.out.println(sound);
	}

	@Override
	public void fly() {
		System.out.println("Duck is flying");
		
	}
}
