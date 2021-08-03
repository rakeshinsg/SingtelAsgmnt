package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Butterfly;

public class ButterflyTest {
	private Butterfly butterfly;
	@Before
	public void setUp() throws Exception {
		butterfly = new Butterfly();
	}

	@After
	public void tearDown() throws Exception {
		butterfly = null;
	}

	@Test
	public void testFly() {
		butterfly.fly();
	}

}
