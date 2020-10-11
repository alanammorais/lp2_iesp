package visao;

import java.util.Scanner;

import modelo.Retangulo;

public class Teste {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base do triângulo:");
		double base = entrada.nextDouble();
		System.out.println("Digite a altura do triângulo:");
		double altura = entrada.nextDouble();
		
        Retangulo t1 = new Retangulo(base, altura);
        System.out.println("Área do triângulo: " + t1 + " cm²");
        
        entrada.close();

    }

}
