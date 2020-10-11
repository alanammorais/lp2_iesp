package visao;

public class Questao1 {
	
	public static double iprf(double sal) {
		return sal * (1 - 0.11);
	}
	
	public static double inss(double sal) {
		return sal * (1 - 0.08);
	}

	public static double sindicato(double sal) {
		return sal * (1 - 0.05);
	}
	
	public static void main(String[] args) {
		double salario = 8000;
		
		double saliq = (salario - iprf(salario))  
				+ (salario - inss(salario)) + (salario - sindicato(salario));
	
		System.out.printf("O salário bruto total é R$%.2f.", salario);
		System.out.printf("%nPagou ao IPRF R$%.2f.", salario - iprf(salario));
		System.out.printf("%nPagou ao INSS R$%.2f.", salario - inss(salario));
		System.out.printf("%nPagou ao Sindicato R$%.2f.", salario - sindicato(salario));
		System.out.printf("%nO salário líquido é R$%.2f.", saliq);
		System.out.printf("%nO valor descontado é R$%.2f.", salario - saliq);



	}

}
