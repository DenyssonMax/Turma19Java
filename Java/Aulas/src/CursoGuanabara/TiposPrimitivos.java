package CursoGuanabara;


import java.util.Scanner;

public class TiposPrimitivos {
	
	public static void main (String args []) {
		
		
		Scanner teclado = new Scanner (System.in); // Digita o comando e escreve o que quer ler. 
		
		System.out.print("Digite o seu nome: ");
			String nome = teclado.nextLine(); // nextLine para ler uma String. 
			
		System.out.print("Qual  sua nota? -  ");
			float nota = teclado.nextFloat(); // nextFloat para ler um float 
			
			System.out.format("%s a sua nota foi %.2f \n", nome, nota);
	}	
		
	}
	
	

