package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Parrot;

public class ParrotTest {
	private Parrot parrot;
	@Before
	public void setUp() throws Exception {
		parrot = new Parrot();
	}

	@After
	public void tearDown() throws Exception {
		parrot = null;
	}

	@Test
	public void testSing() {
		parrot.sing("Woof, woof");
		parrot.sing("Me ow");
		parrot.sing("Cock-a-doodle-doo");
		parrot.sing("Other sounds");
	}

}
