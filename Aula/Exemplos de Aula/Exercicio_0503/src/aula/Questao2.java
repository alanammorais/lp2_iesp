package aula;

public class Questao2 {
	
	
	public static void main(String[] args) {
		System.out.println("Aula");
		
		boolean sexta = true, quinta = false;
		char letra = 'a';
		String texto = "Aula";
		
		double altura, angulo = 75, comprimento = 16;
		
		double angulo_radianos = Math.toRadians(angulo);
		altura = (Math.sin(angulo_radianos) * comprimento);
		
		System.out.println("A altura alcançada com a escada foi: "+altura);
		
		int op1 = 10, op2 = 20, resultado = 0;
		//char operacao = 's';
		
		String operacao = "Soma"; 
		switch (operacao) {
			case "Soma":
			case "+": 
				resultado = op1+op2;
				break;
			case "-":
				resultado = op1-op2;
				break;
			case "/":
				resultado = op1/op2;
				break;
			case "*": 
				resultado = op1*op2;
				break;
			default:
				System.out.println("Nenhuma chave válida");
		}
		
		System.out.println("Resultado: "+resultado);
		
	
		
		if (sexta) {
			System.out.println("Sexta-feira! Dia de Java!");
		} else if (quinta) {
			System.out.println("Quinta-feira!");
		}
		else {
			System.out.println("Não é sexta-feira! =~ ");
		}
		
		System.out.println();
	} 
	

}
