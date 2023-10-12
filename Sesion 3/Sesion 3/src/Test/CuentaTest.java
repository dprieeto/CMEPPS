package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import Sesion3.Cuenta;

class CuentaTest {
	
	private static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("2038 1234", "Prieto", 1000);
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
	@DisplayName("Realiza una prueba de ingreso de dinero a una cuenta.")
	void testIngresar(TestInfo info) {
		System.out.println("Ejecutando prueba: " + info.getTestMethod().get().getName());
		double ingreso = 2500;
		double saldo = cuenta.getSaldo();
		cuenta.ingresar(ingreso);
		saldo += ingreso;
		assertEquals(saldo, cuenta.getSaldo());
	}

	@Test
	@DisplayName("Realiza una prueba de retirada de dinero.")
	void testRetirar(TestInfo info) {
		System.out.println("Ejecutando prueba: " + info.getTestMethod().get().getName());
		double retirar = 500;
		double saldo = cuenta.getSaldo();
		cuenta.retirar(retirar);
		saldo -= retirar;
		assertEquals(saldo, cuenta.getSaldo());
	}
	
	// hacwer en la version 4, un caso de prueba(1 metodo que haga toda la version 4), hacer list movimiento
	@Test
	@DisplayName("Realiza un prueba de las transacciones")
	void testMovimiento(TestInfo info) {
		System.out.println("Ejecutando prueba: " + info.getTestMethod().get().getName());
		
	}
}
