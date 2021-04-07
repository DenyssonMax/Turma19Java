package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {
	/* 
	 * para (tem tamanho definido) - enquanto = fazem os testes no inicio 
	 * fa�a enquanto = faz o teste no final 
	 * 
	 */
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		final double habitantes = 3;
		double salario = 0.00;
		double numeroFilhos=0;
		double mediaSalario=0;
		double totalSalario=0.00;
		double mediaFilhos=0.00;;	
		double totalFilhos=0.00;
		double maiorSalario= 0.00;
		double percentualPessoasSalario100= 0.00;
		double contadorPessoasSalario100= 0.00;
		
		
		for (int x=1; x <= habitantes; x++) {
			
			System.out.printf(" Informe o sal�rio do morador %d R$ ",x);
			salario = leia.nextDouble();
			System.out.print(" Informe a qtde de filhos:  " );
			numeroFilhos = leia.nextDouble();
			System.out.println();
			
			totalSalario += salario; 
			totalFilhos += numeroFilhos;
			
			if (maiorSalario < salario)
			{
				maiorSalario = salario;
			}
			else if ( salario <= 100)
			{
				contadorPessoasSalario100++;
			}	
			
		}
		
		mediaSalario = totalSalario / habitantes;
		mediaFilhos = totalFilhos / habitantes;
		percentualPessoasSalario100 = (contadorPessoasSalario100 / habitantes) * 100.00;	
		
		System.out.printf("\n Total dos sal�rios R$ %.2f ", totalSalario);
		System.out.printf("\n M�dia sal�rio R$ %.2f ", mediaSalario);
		System.out.printf("\n M�dia de filhos � %.1f ", mediaFilhos);
		System.out.printf("\n O maior sal�rio entre os habitantes � %.2f ", maiorSalario);
		System.out.printf("\n O percentual de pessoas com sal�rio acima de R$100.0 %.2f %% ",percentualPessoasSalario100);
			
		leia.close();
	}
	
	public static void linha () {
		System.out.print("==========================================================");
	}

}
