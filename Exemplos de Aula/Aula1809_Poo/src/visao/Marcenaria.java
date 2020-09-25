package visao;

import java.util.Scanner;
import javax.swing.JOptionPane;

import modelo.*;

public class Marcenaria {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Rua Bolinha", 209, "Brooklin");
		Estudante student = new Estudante("João Pedro", end);
		
		
		
		/*
		 String r1_string;
		 
		float r1;
		Circulo c, c2;
		
		r1_string = JOptionPane.showInputDialog("Digite o valor do raio");
		r1 = Float.parseFloat(r1_string);
		
		//Instaciando o objeto Circulo c
		c = new Circulo(r1);
		
		JOptionPane.showMessageDialog(null, "Area do Círculo é: "+ c.calcularArea());

		c.setRaio(7);
		JOptionPane.showMessageDialog(null, "Novo Raio Círculo é: "+ c.getRaio());
		*/
		
		
		
		/*System.out.println("Digite o valor do Raio:");
		Scanner entrada = new Scanner(System.in);
		float r1 = entrada.nextFloat();
		
		Circulo c = new Circulo(r1);
		
		System.out.println("Area do Círculo é: "+ c.calcularArea());
		
		entrada.close();*/

	}

}
