package aula;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExemploAula {

	public static void main(String[] args) {
		/*
		int j = 1;		
		for(int i=0; i<100; i=i+2, j++) {  // i++ é o mesmo de i=i+1;
			System.out.println(j+"o par - "+i);
		}		
			
		for(int i=0; i<100; i= i+2) { 
			System.out.println(((i/2)+1)+"o par - "+i);   
		}
		
		int j = 1;
		for(int i=0; i<100; i++) {  // i++ é o mesmo de i=i+1;
			if (i%2 == 0) {
				System.out.println(j+"o par - "+i);
				j= j+1;
			}
		}*/
		
		//1o par - 0
		//2o par - 2
		String aux, saidaDoWhile = "";
		int parada;
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite o valor da parada: ");
		parada = entrada.nextInt();
		
		System.out.println("Laço while");
		while (numero < parada) { 
			System.out.println("Número: "+ numero);
			numero++;			
		}
		
		
		//Interface Gráfica
		aux = JOptionPane.showInputDialog("Digite o novo valor de parada:");
		parada = Integer.parseInt(aux); //converter String para int	
		
		System.out.println("Laço do-while");
		numero = 0;
		do{ 
			// saidaDoWhile = saidaDoWhile +("Numero: "+ numero+ "\n");
			saidaDoWhile += ("Numero: "+ numero+ "\n");
			numero++;			
		}while (numero < parada);
		
		//JOptionPane.showMessageDialog(null, "Aula Java");
		JOptionPane.showMessageDialog(null, saidaDoWhile);
		
		entrada.close();
		
	}

}
