package atividade2;

import java.util.Scanner;

public class questao2 {

	// Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, n3;
		
		
		System.out.print("Digite um números: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite mais um números: ");
		n2 = sc.nextInt();
		
		System.out.print("Digite o ultimo números: ");
		n3 = sc.nextInt();
		
		if ( n1 < n2 ) 
		{
			if ( n2 < n3) 
			{
				System.out.println(n1+"\n"+n2+"\n"+n3);
			}
			else if ( n1 < n3)
			{
				System.out.println(n1+"\n"+n3+"\n"+n2);
			}
			else 
			{
				System.out.println(n3+"\n"+n1+"\n"+n2);
			}
					
		}
		if ( n2 < n1)
		{
			if ( n1 < n3)
			{
				System.out.println(n2+"\n"+n1+"\n"+n3);
			}
			else if (n2 < n3)
			{
				System.out.println(n2+"\n"+n3+"\n"+n1);
			}
			else 
			{
				System.out.println(n3+"\n"+n2+"\n"+n1);
			}
		}
	}
}
