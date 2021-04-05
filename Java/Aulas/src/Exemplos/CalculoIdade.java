package Exemplos;


import java.util.Scanner;

public class CalculoIdade {
	
	public static void main (String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
				
				
				int a, b, soma;
		
		System.out.println(" Digite o valor de A - ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B - ");
		b = leia.nextInt();
		
		//processamento
		soma = a+b;
				
		//saida
		System.out.println("O valor da soma de A + B é:" +soma);
							
				
	}

}
