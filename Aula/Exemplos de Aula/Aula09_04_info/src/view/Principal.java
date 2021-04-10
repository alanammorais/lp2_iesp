package view;

import model.Emprestimo;
import model.Livro;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Emprestimo emp, emp2;
		Livro li;
		Pessoa pe, pe2;
		
		//Perguntar
		li = new Livro("Machado de Assis", "O alienista", "1143423", "Globo");
		pe = new Pessoa("Ester", "2313123", "Feminino", "9999999", "5th Avenue");
		pe2 = new Pessoa("Andressa", "2313123", "Feminino", "9999999", "5th Avenue");
		
		//Pergunta 
		emp = new Emprestimo("25/03/2021", li, pe);
		emp2 = new Emprestimo("25/03/2021", li, pe2);
		
		System.out.println(emp.info());
		System.out.println(emp2.info());
		
		
		
		
	}

}
