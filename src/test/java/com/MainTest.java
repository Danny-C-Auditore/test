package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
//		int result = main.add(1, 1);
//		assertEquals(2, result);

		int result2 = main.add(2, 0);
		assertEquals(2, result2);
	}

}
