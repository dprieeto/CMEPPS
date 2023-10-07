package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import empleado.Empleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}
	
	/**
	 * Prueba de un empleado vendedor con 0€ ventas al mes y 0 horas extra.
	 */
	@Test
	void testCalculoNominaBrutaVendedor() {
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 0, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado encargado con 0€ ventas al mes y 0 horas extra.
	 */
	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 0, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado vendedor con 1345€ ventas al mes y 0 horas extra
	 */
	@Test
	void testCalculoNominaBrutaVendedorPrima100() {
		float expected = 2100;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1345, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado vendedor con 1501€ ventas al mes y 0 horas extra
	 */
	@Test
	void testCalculoNominaBrutaVendedorPrima200() {
		float expected = 2200;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1501, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado encargado con 1345€ ventas al mes y 0 horas extra
	 */
	@Test
	void testCalculoNominaBrutaEncargadoPrima100() {
		float expected = 2600;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1501, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado encargado con 1501€ ventas al mes y 0 horas extra
	 */
	@Test
	void testCalculoNominaBrutaEncargadoPrima200() {
		float expected = 2700;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1501, 0);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado vendedor con 1345€ ventas al mes y 30 horas extra
	 */
	@Test
	void testCalculoNominaBrutaVendedorExtras() {
		float expected = 2460;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1345, 12);
		assertEquals(expected, actual);
	}
	
	/**
	 * Prueba de un empleado encargado con 2300€ ventas al mes y 17 horas extra
	 */
	@Test
	void testCalculoNominaBrutaEncargadoExtra() {
		float expected = 3210;
		float actual = Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 2300, 17);
		assertEquals(expected, actual);
	}
}
