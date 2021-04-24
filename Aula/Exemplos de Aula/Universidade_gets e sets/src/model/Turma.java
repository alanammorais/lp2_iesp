package model;

public class Turma {
	
	//Composição
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
	
	//get 
	public Aluno getA1() {
		return this.a1;
	}
	
	//set
	public void setA1(Aluno a1) {
		this.a1 = a1;
	}
	
	public Professor getPr() {
		return this.pr;
	}
	
	public void setPr(Professor prof) {
		this.pr = prof;
	}
	
	public Aluno getA2() {
		return a2;
	}

	public void setA2(Aluno a2) {
		this.a2 = a2;
	}

	public Aluno getA3() {
		return a3;
	}

	public void setA3(Aluno a3) {
		this.a3 = a3;
	}

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
		if (nome.equals(a1.getNome()) || nome.equals(a2.getNome()))
			return true;
		else if(nome.equals(a3.getNome()))
			return true;
		else
			return false;
	}
	
	public float maiorCRE() {
		float maior = 0;
		
		if(a1.getCre() > maior)
			maior = a1.getCre();
		if(a2.getCre() > maior)
			maior = a2.getCre();
		if (a3.getCre() > maior)
			maior = a3.getCre();
		
		return maior;
	}
	

}
