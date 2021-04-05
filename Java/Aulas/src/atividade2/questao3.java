package atividade2;

import java.util.Scanner;

// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:

public class questao3 {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			
			
			int idade;
			
			System.out.println(" Olá, qual a sua idade? - ");
			idade = sc.nextInt();
			
			if (idade >= 10 && idade <= 14)
			{
				System.out.println("Sua categoria é infantil!!");
			}
			else if (idade >= 15 && idade <= 17)
			{
				System.out.println("Sua categoria é juvenil!!");
			}
			else if (idade >=18 && idade <=25)
			{
				System.out.println("Sua categoria é adulto!!");
			}
			else 
			{
				System.out.println("Você não se enquadra em nenhuma categoria! Para entrar você precisa ter entre 10 e 25 anos");
			}
			
			sc.close();
			
	}

}
