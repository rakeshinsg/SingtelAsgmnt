package com.singtel.impl;

import com.singtel.Color;
import com.singtel.Size;
import com.singtel.Swimable;

public class Shark implements Swimable {
	private Size size;
	private Color color;
	public Shark(Size size, Color color) {
		this.size = size;
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Shark can eat other fish");
	}

	@Override
	public void swim() {
		System.out.println("Shark can swim");
	}

	@Override
	public String toString() {
		return "Shark [size=" + size + ", color=" + color + "]";
	}
	
}

