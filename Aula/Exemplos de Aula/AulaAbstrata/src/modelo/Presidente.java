package modelo;

public class Presidente extends Funcionario{
	
	private double aditivoReconhecimento;
	private double plr;
	
	
	public Presidente(String nome, String cpf, double horaTrabalhada, int qteHoraTrabalhada) {
		super(nome, cpf, horaTrabalhada, qteHoraTrabalhada);
		this.aditivoReconhecimento = 5000;
		this.plr = 0.05;
	}
	
	public Presidente() {}
	
	@Override
	public double getBonificacao() {
		return ((super.getBonificacao()+this.aditivoReconhecimento) * 1.05);
	}

	public double getAditivoReconhecimento() {
		return aditivoReconhecimento;
	}

	public void setAditivoReconhecimento(double aditivoReconhecimento) {
		this.aditivoReconhecimento = aditivoReconhecimento;
	}

	public double getPlr() {
		return plr;
	}

	public void setPlr(double plr) {
		this.plr = plr;
	}

	@Override
	public String toString() {
		return "Presidente [aditivoReconhecimento=" + aditivoReconhecimento + ", plr=" + plr + ", getBonificacao()="
				+ getBonificacao() + ", getAditivoReconhecimento()=" + getAditivoReconhecimento() + ", getPlr()="
				+ getPlr() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getHoraTrabalhada()="
				+ getHoraTrabalhada() + ", getQteHoraTrabalhada()=" + getQteHoraTrabalhada() + "]";
	}
	
	public void metodoPresidente() {
		System.out.println("Método do Presidente");
	}

	@Override
	public void descontoFilantropia() {
		this.aditivoReconhecimento -= 200;
	}
	
	
	
	
	

}
