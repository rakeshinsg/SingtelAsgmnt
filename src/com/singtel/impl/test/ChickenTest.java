package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Chicken;

public class ChickenTest {
	private Chicken chicken;

	@Before
	public void setUp() throws Exception {
		chicken = new Chicken();
	}

	@After
	public void tearDown() throws Exception {
		chicken = null;
	}

	@Test
	public void testSing() {
		chicken.sing("Chicken Sound");
	}

}
