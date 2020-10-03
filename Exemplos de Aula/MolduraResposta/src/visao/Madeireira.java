package visao;

import java.util.Scanner;

import modelo.Moldura;

public class Madeireira {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		float baseMoldura, alturaMoldura, espessura;
		Retangulo rMenor, rMaior;
		Moldura mold;
		
		System.out.println("Digite a base da moldura:");
		baseMoldura = entrada.nextFloat();
		System.out.println("Digite a altura da moldura:");
		alturaMoldura = entrada.nextFloat();
		System.out.println("Digite a espessura da moldura:");
		espessura = entrada.nextFloat();
		
		rMenor = new Retangulo(baseMoldura-2*espessura, alturaMoldura-2*espessura);
		rMaior = new Retangulo(baseMoldura, alturaMoldura);
		
		mold = new Moldura(rMenor, rMaior);
		System.out.println("A área da moldura é: "+mold.areaMoldura());
		
		//Preço - 1m2 - R$ 30,00
		System.out.println("Valor da moldura em R$ "+mold.valorMoldura(3));
		
		entrada.close();
		
		
	}

}
