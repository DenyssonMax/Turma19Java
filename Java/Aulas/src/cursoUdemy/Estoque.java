package cursoUdemy;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Estoque {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Produto produto = new Produto();
		System.out.println("Data de entrada do produto no estoque: ");
		System.out.print("Nome: ");
		Produto.nome = sc.nextLine();
		System.out.print("Preço:");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.print(produto);
		
		sc.close();
		
	}

}
