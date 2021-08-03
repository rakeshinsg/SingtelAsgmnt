package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Duck;

public class DuckTest {
	private Duck duck;

	@Before
	public void setUp() throws Exception {
		duck = new Duck();
	}

	@After
	public void tearDown() throws Exception {
		duck = null;
	}

	@Test
	public void testSwim() {
		duck.swim();
	}

	@Test
	public void testSing() {
		duck.sing("Duck Sound");
	}

	@Test
	public void testFly() {
		duck.fly();
	}

}
