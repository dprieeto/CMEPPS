package Sesion3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase utilizada para la gestion de la cuenta de un cliente de un banco.
 * @author David Prieto Araujo
 */
public class Cuenta {
	
	private String numero, titular;
	private double saldo;
	private List<Movimiento> mMovimiento;

	/**
	 * Constructor de la clase. Inicializa las variables.
	 * @param numero
	 * @param titular
	 * @param saldo
	 */
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.mMovimiento = new ArrayList<>();
	}

	/**
	 * @return el numero de cuenta.
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero. Modifica el numero de cuenta.
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return titular. Nombre del titular de la cuenta.
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular. Modifica el titular de la cuenta.
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return saldo. Saldo actual de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo. Modifica el saldo actual de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Ingresa dinero y actualiza la cuenta del cliente.
	 * @param x
	 */
	public void ingresar(double x) {
		this.setSaldo( x + this.getSaldo());
	}
	
	/**
	 * Retira dinero y actualiza la cuenta del cliente.
	 * @param x
	 */
	public void retirar(double x) {
		this.setSaldo(this.getSaldo() - x);
	}
}
