package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Caterpillar;

public class CaterpillarTest {
	private Caterpillar caterpillar;

	@Before
	public void setUp() throws Exception {
		caterpillar = new Caterpillar();
	}

	@After
	public void tearDown() throws Exception {
		caterpillar = null;
	}

	@Test
	public void testWalk() {
		caterpillar.walk();
	}

}
