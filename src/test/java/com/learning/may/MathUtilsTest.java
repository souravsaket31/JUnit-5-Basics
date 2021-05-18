package com.learning.may;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mu;
	TestInfo testInfo;
	TestReporter testReporter;
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter ) {

		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mu = new MathUtils();
		
		testReporter.publishEntry("Running "+ testInfo.getDisplayName() );
	}



	@AfterAll
	void cleanUp() {

		System.out.println("clean up..");
	}

	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		assertAll(
				() -> assertEquals(10, mu.add(5, 5)),
				() -> assertEquals(15, mu.add(10, 5)),
				() -> assertEquals(25, mu.add(20, 5))
				);
		
	}

	@Test
	public void testComputeCircleArea() {
		assertEquals(314.16, mu.computeCircleArea(10));
	}

	@Test
	public void testDivideforAirthmeticException() {
		assertThrows(ArithmeticException.class, () -> mu.divide(5, 0));
		// assertEquals(2, mu.divide(6, 3));

	}

}
