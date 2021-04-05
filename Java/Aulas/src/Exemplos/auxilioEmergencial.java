package Exemplos;


import java.util.Scanner;

public class auxilioEmergencial {

public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int chefa, auxilioAnterior, bolsaFamilia, filhos, qntdFilhos = 50, auxilio = 300;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Se você é chefa de família, digite 1 para 'SIM' ou 2 para 'NÃO' ");
		chefa = leia.nextInt();
		System.out.println("Quantos filhos você tem? ");
		filhos = leia.nextInt();
		System.out.println("Se você recebeu o auxílio anteriormente, digite 1 para 'SIM' ou 2 para 'NÃO' ");
		auxilioAnterior = leia.nextInt();
		System.out.println("Digite 1 se você recebeu bolsa familia OU"
				+ ""
				+ " 2 se não recebeu: ");
		bolsaFamilia = leia.nextInt();
		
		
		if (chefa == 1 && auxilioAnterior == 2 && bolsaFamilia == 2) {
			auxilio *= 2;
			qntdFilhos *= filhos;
			auxilio += qntdFilhos;
			System.out.println(nome+ "Você receberá R$ " + auxilio);
		} 
		else if (chefa == 2 && auxilioAnterior == 2 && bolsaFamilia == 2) {
			qntdFilhos *= filhos;
			auxilio += qntdFilhos;
			System.out.println(nome +"Você receberá R$ " + auxilio);
		} 
		else {
			System.out.println(nome + " Você não tem direito ao auxílio");
		}
		
		leia.close();

	}

}

