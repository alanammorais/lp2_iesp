package model;

public class Elevador {
	
	private int andarAtual = 0;
	private int totalAndares;
	private int capacidadeElevador;
	private int pessoasNoElevador = 0;
	
	public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int pessoasNoElevador) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.pessoasNoElevador = pessoasNoElevador;
	}
	
	public Elevador(){}
	
	//get e set

	public void inicializa(int capacidade, int andares) {
		this.capacidadeElevador = capacidade;
		this.totalAndares = andares-1;
	}
	
	public String entra(){
		if (this.pessoasNoElevador < this.capacidadeElevador) {
			this.pessoasNoElevador++;
			return "Pessoa entrou no elevador.";
		}else
			return "Elevador cheio!";
	}
	
	public String sai() {
		if (this.pessoasNoElevador > 0) {
			this.pessoasNoElevador--;
			return "Pessoa saiu do elevador.";
		}else
			return "Elevador Vazio!";
	}
	
	public String sobe() {
		if(this.andarAtual < this.totalAndares) {
			this.andarAtual++;
			return "Subiu um andar";
		}else
			return "Elevador no último andar.";
	}

	public String desce() {
		if(this.andarAtual > 0) {
			this.andarAtual--;
			return "Desceu um andar";
		}else
			return "Elevador no primeiro andar.";
	}

	public String toString() {
		return "Elevador [andarAtual=" + this.andarAtual + 
				", pessoasNoElevador=" + this.pessoasNoElevador +
				", \ntotalAndares=" + this.totalAndares + 
				", capacidadeElevador="+ this.capacidadeElevador + "]";
	}
	
	
}
