package visao;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		//Primeira forma - qlqr tipo de dado
		ArrayList lista1 = new ArrayList(); 
		lista1.add(10);
		lista1.add("Java");
		lista1.add(new Retangulo(2,4));
		lista1.add(1, "teste");
		
		System.out.println("\n");
		for (Object temp : lista1) {
			System.out.println(temp);
		}
		
		lista1.set(1, "bolinha");
		
		System.out.println("\n");
		for (Object temp : lista1) {
			System.out.println(temp);
		}
		
		
		//System.out.println(lista1.get(1));
		
		System.out.println("\nFor 1:");				
		for (int i=0; i<lista1.size(); i++) {
			Object a = lista1.get(i);
			System.out.println("Posição "+i+": "+a);
		}
		
		System.out.println("\nFor 2:");
		for (Object temp : lista1) {
			System.out.println(temp);
		}
		
		
		//Segunda forma - restringe o tipo dado armazenado
		ArrayList<ArrayList<String>> listaDeLista = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("UNIESP");
		lista2.add("Semana de Provas");
		//lista2.add(10); // Erro
		//System.out.println(lista2.get(0));
		
		System.out.println("\nFor 3:");				
		for (int i=0; i<lista2.size(); i++) {
			String x = lista2.get(i);
			System.out.println("Posição "+i+": "+ x);
		}
		
		System.out.println("\nFor 4:");
		for (String temp : lista2) {
			System.out.println(temp);
		}
		
		

	}

}
