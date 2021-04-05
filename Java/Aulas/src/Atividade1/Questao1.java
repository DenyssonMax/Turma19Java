package Atividade1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
		int ano, idade, mes, dias;
		String nome;
		ano = 365;
		
		 
		System.out.println("Olá, escreva seu nome:  ");
		nome = leia.next();
		
		System.out.println(nome+", quantos anos você tem:  ");
		idade = leia.nextInt();
		
		int anos = ano * idade;
		
		System.out.println(" Quantos meses:  ");
		mes = leia.nextInt();
		
		int meses = mes * 30;
		
		System.out.println(" Quantidade de dia do mês que você está:  ");
		dias = leia.nextInt();
		
		
		System.out.println(nome+", você tem mais ou menos "+ anos + meses + dias+" dias na terra!!");
		
				

	}

}
