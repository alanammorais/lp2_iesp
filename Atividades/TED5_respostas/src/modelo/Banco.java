package modelo;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> listaDeContas;

	public Banco() {}
		
	public Banco(ArrayList<Conta> contas) {
		this.listaDeContas = contas;
	}
	
	public void gerador(int quantidade) {
		int tempNum;
		double salario = 0;
		
		for (int i = 0; i < quantidade; i++) {
			tempNum = (int) (Math.random()* 100000000);
			salario = (double)((int)(Math.random()*1000000 * Math.random()))/100;
			this.listaDeContas.add(new Conta(tempNum, salario));
		}
	}
		
	public Conta maiorSaldo() {
		double maiorSalario = 0;
		Conta maiorConta = null;
		for (Conta c: listaDeContas) {
			if (maiorSalario < c.getSaldo()) {
				maiorConta = c;
			}
		}
		
		return maiorConta;
	}

		
	//get e set
	public ArrayList<Conta> getListaDeContas() {
		return listaDeContas;
	}

	public void setListaDeContas(ArrayList<Conta> listaDeContas) {
		this.listaDeContas = listaDeContas;
	}

	public String toString() {
		return "Banco [listaDeContas=" + listaDeContas + "]";
	}
	
	
}
