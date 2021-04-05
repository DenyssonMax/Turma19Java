package cursoUdemy;

import java.util.Scanner;

public class exemWhile {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		int soma = 0;
		
		System.out.println("Escreva um valor:  ");
		x = sc.nextInt();
		
		while (x!= 0) {
			soma += x; 
			x = sc.nextInt();
		}
		
		System.out.println(soma);
				
		sc.close();

	}

}
