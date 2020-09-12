package visao;

import modelo.Aluno;

public class Universidade {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João",4444,"Sistemas para Internet"); //instanciar
		
		/* Se atributos públicos
		a1.nome = "Fernando";
		a1.matricula= 1223;
		a1.curso="Sistemas para Internet";*/
		
		System.out.println(a1.matricularAluno());
		
		
		Aluno a2 = new Aluno("Taisia", 5555, "Sistemas para Internet"); //instanciar
		System.out.println(a2.matricularAluno());
		
		//System.out.println(a1.nome);
		//System.out.println(a2.nome);		

	}

}
