package Exemplos;


import java.util.Scanner;

public class auxilioEmergencial {

public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int chefa, auxilioAnterior, bolsaFamilia, filhos, qntdFilhos = 50, auxilio = 300;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Se voc� � chefa de fam�lia, digite 1 para 'SIM' ou 2 para 'N�O' ");
		chefa = leia.nextInt();
		System.out.println("Quantos filhos voc� tem? ");
		filhos = leia.nextInt();
		System.out.println("Se voc� recebeu o aux�lio anteriormente, digite 1 para 'SIM' ou 2 para 'N�O' ");
		auxilioAnterior = leia.nextInt();
		System.out.println("Digite 1 se voc� recebeu bolsa familia OU"
				+ ""
				+ " 2 se n�o recebeu: ");
		bolsaFamilia = leia.nextInt();
		
		
		if (chefa == 1 && auxilioAnterior == 2 && bolsaFamilia == 2) {
			auxilio *= 2;
			qntdFilhos *= filhos;
			auxilio += qntdFilhos;
			System.out.println(nome+ "Voc� receber� R$ " + auxilio);
		} 
		else if (chefa == 2 && auxilioAnterior == 2 && bolsaFamilia == 2) {
			qntdFilhos *= filhos;
			auxilio += qntdFilhos;
			System.out.println(nome +"Voc� receber� R$ " + auxilio);
		} 
		else {
			System.out.println(nome + " Voc� n�o tem direito ao aux�lio");
		}
		
		leia.close();

	}

}

