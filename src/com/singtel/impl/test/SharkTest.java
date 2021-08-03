package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.Color;
import com.singtel.Size;
import com.singtel.impl.Shark;

public class SharkTest {
	private Shark shark;

	@Before
	public void setUp() throws Exception {
		shark = new Shark(Size.LARGE, Color.GREY);
	}

	@After
	public void tearDown() throws Exception {
		shark = null;
	}

	@Test
	public void testEat() {
		shark.eat();
	}

	@Test
	public void testSwim() {
		shark.swim();
		shark.toString();
	}

}
