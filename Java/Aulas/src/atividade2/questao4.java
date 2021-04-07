package atividade2;

import java.util.Scanner;

	// Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//ímpar exiba o número elevado ao quadrado. 

public class questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1;
		
		System.out.println(" Digite um número: ");
		n1 = sc.nextInt();
		
		if  (n1 == 0)   
		{		
			System.out.println(" O número que você digitou não é válido");
				
		}
		else if( n1 %2 == 0)
		{
			System.out.printf(" Seu número é PAR e a raiz quadrada dele é: " +  Math.sqrt(n1)); 
		}
		else 
		{
			System.out.println(" Seu número é IMPAR e o valor dele ao quadrado é: "+ Math.pow(n1, 2));
		}

		sc.close();
		}
				
	}




