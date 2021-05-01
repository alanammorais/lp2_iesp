package view;

import model.Elevador;

public class Teste {
	
	public static void main(String args[]) {
		
		Elevador elevator = new Elevador();
		
		elevator.inicializa(8, 10);
		System.out.println(elevator.desce());
		System.out.println(elevator.sobe());
		System.out.println(elevator.sai());
		System.out.println(elevator.entra());
		System.out.println(elevator.sobe());
		
		System.out.println(elevator);
		
	} 

}
