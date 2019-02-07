package com.adp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BidonTest {


	
	@Test
	public final void unSuccessSimule() {
		assertTrue("Un succes non mérité", true);
	}

	@Test
	public final void unEchecSimule() {
		fail("un echec programme"); // TODO
	}
	
	
	@Test
	public final void unAutreEchecSimule() {
		fail("encore un echec");
	}

}
