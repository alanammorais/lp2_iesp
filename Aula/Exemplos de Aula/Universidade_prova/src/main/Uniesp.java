package main;

import model.Aluno;
import model.Professor;
import model.Turma;

public class Uniesp {
	
	public static void main(String[] args) {
		Aluno jose = new Aluno("Jose", "202021Aluno", 6, "SI");
		Aluno maria = new Aluno("Maria", "202022Aluno", 10, "SI");
		Aluno paula = new Aluno("Paula", "202023Aluno", 8, "SI");
		
		Professor prof = new Professor("Alana", "Prof123", "Java", "SI");
		Turma poo = new Turma(jose, maria, paula, prof);
		
		if (poo.verificarAluno("Maria"))
			System.out.println("Matriculado");
		else
			System.out.println("Nao Matriculado");
		
		poo.imprimeAlunosMatriculados();
		
		System.out.println("Maior CRE "+ poo.maiorCRE());
	}

}
