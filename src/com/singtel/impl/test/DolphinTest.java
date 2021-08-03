package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.impl.Dolphin;

public class DolphinTest {
	private Dolphin dolphin;

	@Before
	public void setUp() throws Exception {
		dolphin = new Dolphin();
	}

	@After
	public void tearDown() throws Exception {
		dolphin = null;
	}

	@Test
	public void testSwim() {
		dolphin.swim();
	}

}
