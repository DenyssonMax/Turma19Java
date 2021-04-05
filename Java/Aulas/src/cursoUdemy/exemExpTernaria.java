package cursoUdemy;

import java.util.Scanner;

public class exemExpTernaria {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);

		double preco;
		
		
		System.out.println("Qual foi o valor do seu produto? \n Digite aqui:");
		preco = sc.nextDouble();
		
		double desconto = (preco <20.0) ? preco * 0.1 : preco * 0.05;
		
			System.out.printf(" O valor do seu desconto será de: R$" + desconto );
			
			
			sc.close();
		}
	}

