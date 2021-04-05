package atividade2;

import java.util.Scanner;

public class questao1 {
	
	//Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			
			int n1, n2, n3;
			
			System.out.print("Digite um números: ");
			n1 = sc.nextInt();
			
			System.out.print("Digite mais um números: ");
			n2 = sc.nextInt();
			
			System.out.print("Digite o ultimo números: ");
			n3 = sc.nextInt();
			
			if (n1 > n2 && n1 > n3)
			{
				
				System.out.print("O numero maior é "+ n1);
			}
			else if (n2 > n3 && n2 > n1)
			{
				System.out.print("O numero maior é "+ n2);
			}
			else if ( n3 > n1 && n3 > n2)
			{
				System.out.println("O numero maior é "+ n3);
			}
			else 
			{
				System.out.println("você digitou valores inválidos. Por favor, tente novamemte!!");
			}
			
			sc.close();
	}

}
