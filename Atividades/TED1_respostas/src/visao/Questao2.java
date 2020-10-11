package visao;

public class Questao2 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int c = -13;
		double delta = 0;
	
		delta = (b*b) - (4 * a * c);		
		double raizQuadradaCalculada = Math.sqrt(delta); 
		
		double raizPositiva = ((-b) + raizQuadradaCalculada) / 2 * a ;
		double raizNegativa = ((-b) - raizQuadradaCalculada) / 2 * a;
	
		System.out.printf("As raízes da equação são %.0f e %.0f.", raizPositiva, raizNegativa);

	}
}
