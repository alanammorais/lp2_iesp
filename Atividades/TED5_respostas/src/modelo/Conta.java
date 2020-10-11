package modelo;

public class Conta {
	private int numero;
	private double saldo;

	public Conta() {}
		
	public Conta(int n, double s) {
		this.numero = n;
		this.saldo = s;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
		
	
}
