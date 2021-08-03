package com.singtel.impl;

import com.singtel.Singable;

public class Chicken implements Singable {

	@Override
	public void sing(String sound) {
		System.out.println(sound);
	}
}
