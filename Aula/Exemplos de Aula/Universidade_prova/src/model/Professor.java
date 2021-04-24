package model;

public class Professor {

	private String nome;
	private String matricula;
	private String disciplina;
	private String coordenacao;
	
	public Professor(String nome, String matricula, String disciplina, String coordenacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.coordenacao = coordenacao;
	}
	
	public Professor() {}

	public String toString() {
		return "Professor - nome=" + nome + ", matricula=" + matricula + ", disciplina=" + disciplina + ", coordenacao="
				+ coordenacao;
	}
	
	
	
}
