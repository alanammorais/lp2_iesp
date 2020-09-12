package modelo;

public class Aluno {
	
	//1.Pensar nos atributos
	//nome, matricula, curso
	private String nome;
	private double matricula;
	private String curso;
	
	
	//2.Pensar Construtor
	//é ele quem vai permitir a criação dos meus objetos
	public Aluno(String n, double m, String c) {
		this.nome = n;
		this.matricula = m;
		this.curso = c ;
	}
		
	
	//3. Outros métodos
	public String matricularAluno() {
		//operacoes
		return (this.nome+" foi matriculado!");
	}
	
	
	
	

}
