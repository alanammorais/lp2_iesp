package view;

import model.Moldura;
import model.MolduraRetangular;
import model.Retangulo;

public class TesteRetangulo {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(10, 2);
		System.out.println(r1.calcularArea());
		
		System.out.println("\nCalculo Moldura");
		Moldura m1 = new Moldura(10, 30, 2);
		System.out.println("O valor da área é:"+ m1.area());
		
		//moldura retangular
		System.out.println("\n\nCalculo Moldura Retangular");
		Retangulo rMa= new Retangulo(10, 30);
		Retangulo rMe= new Retangulo(6, 26);
		
		MolduraRetangular m2 = new MolduraRetangular(rMa, rMe);
		System.out.println("O valor da área é:"+ m2.area());
		

	}

}
