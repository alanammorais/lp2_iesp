package visao;

import java.util.ArrayList;

import modelo.Diretor;
import modelo.Funcionario;
import modelo.Gerente;
import modelo.Presidente;

public class MoraisStore {
	
	public static void main(String args[]) {
		
		//Funcionario lucas = new Funcionario("Lucas", "2319324", 80, 30);
		Gerente andressa = new Gerente("Andressa", "4355465", 100, 40);
		Presidente andre = new Presidente("André", "23123214", 2000, 10);
		Diretor ana = new Diretor("Ana", "456546546", 90, 100);
				
		//System.out.println(lucas.descontoFilantropia());
		System.out.println(andressa);
		System.out.println(andre);
		System.out.println(ana);
		andre.metodoPresidente();
		
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		
		Funcionario alana = new Presidente("Alana", "222333", 3000, 10);
		System.out.println(alana.getBonificacao());
		//alana.metodoPresidente(); //Nao sou objeto Presidente
		//Presidente p = new Funcionario(); //ilegal
		
		
		
		
		
		
		
	}

}
