package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class TuoteTest {

	@Test
	final void testSetHintaAlleNolla() {
		double hinta = -1;
		Tuote tuote1 = new Tuote();
		boolean tulos = tuote1.setHinta(hinta);
		Assert.assertTrue(tulos == false);
	}

	@Test
	final void testSetHintaNollaTaiYliNolla() {
		double hinta = 0;
		Tuote tuote1 = new Tuote();
		boolean tulos = tuote1.setHinta(hinta);
		Assert.assertTrue(tulos == true);
	}
	
}
