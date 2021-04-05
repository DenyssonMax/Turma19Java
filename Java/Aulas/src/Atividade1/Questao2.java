package Atividade1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int diasVida;
		String nome;
		
		System.out.println("Olá, escreva seu nome: ");
		nome = leia.next();
		
		System.out.println(nome+" quantos dias de vida você tem: ");
		diasVida = leia.nextInt();
		
		int anos = diasVida / 365; 
		int meses = (diasVida%365)/30;
		int dias = (diasVida%365)%30;
		
		System.out.println(nome+", você tem mais ou menos" + anos +" anos "+ meses +"meses e "+ dias +" dias na terra!!");

			
		}

}






