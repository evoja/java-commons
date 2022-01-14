package net.evoja.checkerframework.units;

import org.junit.jupiter.api.Test;

import static org.checkerframework.checker.units.util.UnitsTools.*;
import static org.junit.jupiter.api.Assertions.*;

public class UnitsTest {

	@Test
	public void fromMilliSecondToSecond() {
		assertEquals(1, Units.fromMilliSecondToSecond(1000 * Units.ms));
		assertEquals(2, Units.fromMilliSecondToSecond(2499 * Units.ms));
		assertEquals(2, Units.fromMilliSecondToSecond(2500 * Units.ms));
	}

	@Test
	public void testFromMilliSecondToSecond() {
		assertEquals(1, Units.fromMilliSecondToSecond(1000L * Units.ms));
		assertEquals(2, Units.fromMilliSecondToSecond(2499L * Units.ms));
		assertEquals(2, Units.fromMilliSecondToSecond(2500L * Units.ms));
	}

	@Test
	public void fromSecondToMilliSecond() {
		assertEquals(100000, Units.fromSecondToMilliSecond(100 * s));
	}

	@Test
	public void testFromSecondToMilliSecond() {
		assertEquals(100000L, Units.fromSecondToMilliSecond(100L * s));
	}
}
