
public class Aplicacao {
	
	static float area, area2;
	
	public static float calcularArea(float base, float altura){
		return base * altura;
	}
		
	public static void main(String[] args) {
		float b=10, h=5;
		float b2=15, h2=7;
		
		area = calcularArea(b,h);
		area2 = b2 * h2;
		
		System.out.println("Área do Retângulo é "+area);

	}

}
