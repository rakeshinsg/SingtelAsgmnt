package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Chicken;
import com.singtel.impl.Rooster;

public class RoosterTest {
	private Rooster rooster;

	@Before
	public void setUp() throws Exception {
		rooster = new Rooster(new Chicken());
	}

	@After
	public void tearDown() throws Exception {
		rooster = null;
	}

	@Test
	public void testSing() {
		rooster.sing("Rooster sound");
	}

}
