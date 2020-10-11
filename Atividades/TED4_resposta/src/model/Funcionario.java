package model;

public class Funcionario {
	
	private int id;
	private int idSetor;
	private double salario;
	private int rg;
	private boolean contratado;
	

	public Funcionario() {}
	
	public Funcionario(int id, int idSetor, double salario, int rg, boolean contratado) {
		this.id = id;
		this.idSetor = idSetor;
		this.salario = salario;
		this.rg = rg;
		this.contratado = contratado;
	}
	
	public void aumentoSalario(double sal) {
		this.salario += sal;
	}
	
	public void demitir() {
		this.contratado = !this.contratado;
	}
 	
	public String toString() {
		return "Id Usuario: " + this.id + ", id setor: " + idSetor + ",salario: " + this.salario + 
				",rg: " + this.rg + " ,contratado: " + this.contratado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}
	
}
