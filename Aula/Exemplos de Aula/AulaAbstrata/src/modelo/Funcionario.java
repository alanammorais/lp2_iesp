package modelo;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double horaTrabalhada;
	private int qteHoraTrabalhada;
	
	public Funcionario(String nome, String cpf, double horaTrabalhada, int qteHoraTrabalhada) {
		super(); //construtor da classe Object
		this.nome = nome;
		this.cpf = cpf;
		this.horaTrabalhada = horaTrabalhada;
		this.qteHoraTrabalhada = qteHoraTrabalhada;
	}
	
	public Funcionario() {}
	
	//métodos abstratos
	public abstract void descontoFilantropia();

	
	public double getBonificacao() {
		return this.horaTrabalhada * this.qteHoraTrabalhada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getHoraTrabalhada() {
		return horaTrabalhada;
	}

	public void setHoraTrabalhada(double horaTrabalhada) {
		this.horaTrabalhada = horaTrabalhada;
	}

	public int getQteHoraTrabalhada() {
		return qteHoraTrabalhada;
	}

	public void setQteHoraTrabalhada(int qteHoraTrabalhada) {
		this.qteHoraTrabalhada = qteHoraTrabalhada;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", horaTrabalhada=" + horaTrabalhada
				+ ", qteHoraTrabalhada=" + qteHoraTrabalhada + ", getBonificacao()=" + getBonificacao() + "]";
	}

	
}
