package model;

public class Turma {
	
	private Aluno a1;
	private Aluno a2;
	private Aluno a3;
	private Professor pr;
	
	public Turma(Aluno a1, Aluno a2, Aluno a3, Professor pr) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.pr = pr;
	}
	
	public Turma() {}

	public void imprimeAlunosMatriculados() {
		System.out.println("Turma [aluno 1=" + this.a1 + 
				"\n aluno 2=" + this.a2 + "\n aluno 3=" + this.a3 + "]");
	}
	
	public String toString() {
		return "Turma [aluno 1=" + this.a1 +
				"\n aluno 2=" + this.a2 +
				"\n aluno 3=" + this.a3 +
				"\n Professor=" + this.pr +
				"]";
	}
	
	public boolean verificarAluno(String nome) {
		if (nome.equals(a1.nome) || nome.equals(a2.nome))
			return true;
		else if(nome.equals(a3.nome))
			return true;
		else
			return false;
	}
	
	public float maiorCRE() {
		float maior = 0;
		
		if(a1.cre > maior)
			maior = a1.cre;
		if(a2.cre > maior)
			maior = a2.cre;
		if (a3.cre > maior)
			maior = a3.cre;
		
		return maior;
	}
	

}
