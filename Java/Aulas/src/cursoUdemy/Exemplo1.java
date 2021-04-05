package cursoUdemy;

	import java.util.Locale;
	import java.util.Scanner;
	
	 
	public class Exemplo1 {
	
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner valor = new Scanner (System.in);
			
			String produto1 = "computador";
			String produto2 = "mesa de escritório";
			String nome = "Denysson";
			String linha = "===================================================================";
			
			int idade = 30, cpf = 529;
			char sexo = 'M';
			
			double valor1 = 2100.0, valor2 = 650.50, medida = 53.234567;
			
			System.out.println(linha);
			
			System.out.printf(" \t O valor do %s é de %.2f !! \n  ", produto1, valor1);
			System.out.printf(" \t O valor da %s é de %.2f !! \n ", produto2, valor2);
			
			System.out.println(linha);
			
			System.out.printf("Registo no sistema:\n Funcionário: %s \n Idade: %d anos\n CPF: %d\n Sexo: %s \n", nome , idade, cpf, sexo);
			
			System.out.println(linha);
			
			System.out.printf("A medida solicitada é: %.8f \n", medida);
			System.out.printf("O valor arredondado é: %.3f", medida);
			
		
	
		}
	
	}
