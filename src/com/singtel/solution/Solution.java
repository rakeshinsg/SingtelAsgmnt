package com.singtel.solution;

import com.singtel.Animal;
import com.singtel.Color;
import com.singtel.Flyable;
import com.singtel.Singable;
import com.singtel.Size;
import com.singtel.Swimable;
import com.singtel.Walkable;
import com.singtel.impl.Butterfly;
import com.singtel.impl.Caterpillar;
import com.singtel.impl.Chicken;
import com.singtel.impl.Clownfish;
import com.singtel.impl.Dolphin;
import com.singtel.impl.Duck;
import com.singtel.impl.Parrot;
import com.singtel.impl.Rooster;
import com.singtel.impl.Shark;

public class Solution {
	static int flyableCount = 0;
	static int walkableCount = 0;
	static int singableCount = 0;
	static int swimableCount = 0;
	
	public static void count(Animal[] animals) {
		for(Animal ani: animals) {
			if(ani instanceof Flyable) {
				flyableCount++;
			} 
			
			if(ani instanceof Walkable) {
				walkableCount++;
			} 
			
			if(ani instanceof Singable) {
				singableCount++;
			} 
			if(ani instanceof Swimable) {
				swimableCount++;
			}
		}
		
	}
	public static void main(String[] args) {
	 
	 Animal[] animals = new Animal[]{
			 new Duck(),
			 new Chicken(),
			 new Rooster(new Chicken()),
			 new Parrot(), // Parrot behavior can change based on the sing parameter
			 new Shark(Size.LARGE,Color.GREY),
			 new Clownfish(Size.SMALL,Color.ORANGE),
			 new Dolphin(),
			 new Caterpillar(),
			 new Butterfly (),
			 };
	 count(animals);
	 System.out.println(flyableCount+" of these animals can fly");
	 System.out.println(walkableCount+" of these animals can walk");
	 System.out.println(singableCount+" of these animals can sing");
	 System.out.println(swimableCount+" of these animals can swim");
	}
	
	
	 
}
