package visao;

import java.util.Scanner;

public class App {
	
	public static float calcularArea(float altura, float base) {
		float a = altura*base;
		return a;
	}
	
	public static void main(String[] args) {	
		//Calcular a area do retangulo
		
		float b, h;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base:");
		b = entrada.nextFloat();
		
		System.out.println("Digite a altura:");
		h = entrada.nextFloat();
		
		//calcularArea(b,h);
		System.out.println("A área do Retângulo é "+ calcularArea(b,h));
		
		entrada.close();
		
	}

}
