package atividade2;

import java.util.Scanner;

public class questao1 {
	
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			
			int n1, n2, n3;
			
			System.out.print("Digite um n�meros: ");
			n1 = sc.nextInt();
			
			System.out.print("Digite mais um n�meros: ");
			n2 = sc.nextInt();
			
			System.out.print("Digite o ultimo n�meros: ");
			n3 = sc.nextInt();
			
			if (n1 > n2 && n1 > n3)
			{
				
				System.out.print("O numero maior � "+ n1);
			}
			else if (n2 > n3 && n2 > n1)
			{
				System.out.print("O numero maior � "+ n2);
			}
			else if ( n3 > n1 && n3 > n2)
			{
				System.out.println("O numero maior � "+ n3);
			}
			else 
			{
				System.out.println("voc� digitou valores inv�lidos. Por favor, tente novamemte!!");
			}
			
			sc.close();
	}

}
