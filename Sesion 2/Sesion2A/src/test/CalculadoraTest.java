package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cmepps.Calculadora;

/**
 * Esta clase realiza las pruebas unitarias de los metodos de la clase Calculadora.
 * @author David Prieto Araujo
 */
class CalculadoraTest {

	static int value1, value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("->Ejecutando Before all: configuracion antes de todas las pruebas");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("->Ejecutando After all: limpieza despues de todas las pruebas");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("->Ejecutando Before each: configuracion antes de cada prueba");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("->Ejecutando After each: limpieza despues de cada prueba");
	}

	@Test
	void testSuma() {
		int expected =8;
		int actual = Calculadora.suma(value1, value2);
		assertEquals(expected, actual);		
	}

	@Test
	void testResta() {
		int expected =2;
		int actual = Calculadora.resta(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected =1;
		int actual = Calculadora.divide(value1, value2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDividePor0() {
		int expected =-1;
		int actual = Calculadora.divide(value1, 0);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected =15;
		int actual = Calculadora.multiplica(value1, value2);
		assertEquals(expected, actual);
	}
}
