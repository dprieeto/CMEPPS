package Sesion3;

/**
 * 
 * @author David Prieto Araujo
 */
public class Cuenta {
	
	private String numero, titular;
	private double saldo;

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
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double x) {
		this.setSaldo( x + this.getSaldo());
	}
	
	public void retirar(double x) {
		this.setSaldo(this.getSaldo() - x);
	}
}
