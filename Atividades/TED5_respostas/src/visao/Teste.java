package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Banco;
import modelo.Conta;

public class Teste {
	public static void main(String[] args) {
		
		int quantidade;	
		Banco contas = new Banco(new ArrayList<Conta>());
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de contas a serem geradas: ");
		quantidade = entrada.nextInt();
		entrada.close();
		
		contas.gerador(quantidade);
		System.out.println(contas);
		
		System.out.print("Maior SALDO: "+contas.maiorSaldo());
	}
}
