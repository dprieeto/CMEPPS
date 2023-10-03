package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cmepps.Calculadora;

class CalculadoraTest {

	static int value1, value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		value1 = 5;
		value2 = 3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int expected =8;
		int actual = Calculadora.suma(value1, value2);
		//assertEquals(expected, actual);
		
	}

	@Test
	void testResta() {
		int expected =2;
		int actual = Calculadora.resta(value1, value2);
		//assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected =1;
		int actual = Calculadora.divide(value1, value2);
		//assertEquals(expected, actual);
	}
	
	@Test
	void testDividePor0() {
		int expected =-1;
		int actual = Calculadora.divide(value1, 0);
		//assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected =15;
		int actual = Calculadora.multiplica(value1, value2);
		//assertEquals(expected, actual);
	}

}