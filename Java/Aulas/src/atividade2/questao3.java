package atividade2;

import java.util.Scanner;

// Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:

public class questao3 {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			
			
			int idade;
			
			System.out.println(" Ol�, qual a sua idade? - ");
			idade = sc.nextInt();
			
			if (idade >= 10 && idade <= 14)
			{
				System.out.println("Sua categoria � infantil!!");
			}
			else if (idade >= 15 && idade <= 17)
			{
				System.out.println("Sua categoria � juvenil!!");
			}
			else if (idade >=18 && idade <=25)
			{
				System.out.println("Sua categoria � adulto!!");
			}
			else 
			{
				System.out.println("Voc� n�o se enquadra em nenhuma categoria! Para entrar voc� precisa ter entre 10 e 25 anos");
			}
			
			sc.close();
			
	}

}
