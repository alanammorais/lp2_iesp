package view;

import model.Funcionario;

public class Empresa {
	
	public static void main(String[] args) {
		
		Funcionario [] listaFuncionario = { 
				new Funcionario(1010, 2, 2000.0, 123123, true),
				new Funcionario(1011, 3, 1500.0, 321321, true),
				new Funcionario(1012, 4, 1700.0, 432432, false),
				new Funcionario(1013, 5, 1000.0, 543543, true),
				new Funcionario(1014, 6, 1200.0, 654654, false)
		};
		
		listaFuncionario[0].aumentoSalario(5000.0);
		listaFuncionario[0].demitir();

		for(int i=0; i < listaFuncionario.length; i++) {
			System.out.println(listaFuncionario[i]);
		}
		
	}

}
