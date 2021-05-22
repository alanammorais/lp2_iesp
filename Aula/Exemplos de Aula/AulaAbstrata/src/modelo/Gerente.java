package modelo;

public class Gerente extends Funcionario{
	
	private double valorGratificacao;

	public Gerente(String nome, String cpf, double horaTrabalhada, int qteHoraTrabalhada) {
		super(nome, cpf, horaTrabalhada, qteHoraTrabalhada);
		this.valorGratificacao = 3000;
	}
	
	public Gerente() {
		super();
	}
	
	public double getBonificacao(){
		return (super.getBonificacao() + this.valorGratificacao);
	}
	

	public double getValorGratificacao() {
		return valorGratificacao;
	}

	public void setValorGratificacao(double valorGratificacao) {
		this.valorGratificacao = valorGratificacao;
	}

	@Override
	public String toString() {
		return "Gerente [valorGratificacao=" + valorGratificacao + ", getValorGratificacao()=" + getValorGratificacao()
				+ ", getBonificacao()=" + getBonificacao() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getHoraTrabalhada()=" + getHoraTrabalhada() + ", getQteHoraTrabalhada()=" + getQteHoraTrabalhada()
				+ "]";
	}

	@Override
	public void descontoFilantropia() {
		this.valorGratificacao -= 100;
	}
	
	
	

}
