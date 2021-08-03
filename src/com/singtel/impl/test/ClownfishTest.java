package com.singtel.impl.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singtel.Color;
import com.singtel.Size;
import com.singtel.impl.Clownfish;

public class ClownfishTest {
	private Clownfish clownfish;

	@Before
	public void setUp() throws Exception {
		clownfish = new Clownfish(Size.SMALL,Color.ORANGE);
	}

	@After
	public void tearDown() throws Exception {
		clownfish = null;
	}

	@Test
	public void testMakeJokes() {
		clownfish.makeJokes();
		clownfish.toString();
	}

	@Test
	public void testSwim() {
		clownfish.swim();
	}

}
