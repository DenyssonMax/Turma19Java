package atividade2;

import java.util.Scanner;

	// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	//	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	//�mpar exiba o n�mero elevado ao quadrado. 

public class questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1;
		
		System.out.println(" Digite um n�mero: ");
		n1 = sc.nextInt();
		
		if  (n1 == 0)   
		{		
			System.out.println(" O n�mero que voc� digitou n�o � v�lido");
				
		}
		else if( n1 %2 == 0)
		{
			System.out.printf(" Seu n�mero � PAR e a raiz quadrada dele �: " +  Math.sqrt(n1)); 
		}
		else 
		{
			System.out.println(" Seu n�mero � IMPAR e o valor dele ao quadrado �: "+ Math.pow(n1, 2));
		}

		sc.close();
		}
				
	}




