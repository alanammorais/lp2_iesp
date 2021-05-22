package modelo;

public class Diretor extends Gerente{

	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, double horaTrabalhada, int qteHoraTrabalhada) {
		super(nome, cpf, horaTrabalhada, qteHoraTrabalhada);
		setValorGratificacao(5000);
	}

	@Override
	public String toString() {
		return "Diretor [getBonificacao()=" + getBonificacao() + ", getValorGratificacao()=" + getValorGratificacao()
				+ ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getHoraTrabalhada()=" + getHoraTrabalhada()
				+ ", getQteHoraTrabalhada()=" + getQteHoraTrabalhada() + "]";
	}
	
	

}
