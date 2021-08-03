package com.singtel.impl;

import com.singtel.Color;
import com.singtel.Size;
import com.singtel.Swimable;

public class Clownfish implements Swimable {
	private Size size;
	private Color color;
	public Clownfish(Size size, Color color) {
		this.size = size;
		this.color = color;
	}
	
	public void makeJokes() {
		System.out.println("Clownfish can make jokes");
	}

	@Override
	public void swim() {
		System.out.println("Clownfish can swim");
	}

	@Override
	public String toString() {
		return "Clownfish [size=" + size + ", color=" + color + "]";
	}

}
