package com.adp.business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculTest {

	private ICalcul underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new Calcul();
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public final void testAdditioner() {

		// ARRANGE
		int a = 11;
		int b = 22;
		int expected = 33;

		// ACT
		int actual = underTest.additioner(a, b);

		// ASSERT
		assertEquals(expected, actual);
	}

}
