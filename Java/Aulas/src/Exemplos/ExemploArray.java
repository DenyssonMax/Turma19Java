package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		String nomes[] = new String [4];  // nomes [0], nomes [1], nomes [2]
		double notas[] = new double [4];
		
		for (int x=0; x<4; x++){
			System.out.printf( "Digite o nome %d: ", x+1);
			nomes[x] = leia.next();
			System.out.printf( "Digite a nota: ");
			notas[x] = leia.nextDouble();
			
		}
		 for (int x=0; x<nomes.length; x++) {
			 
			 if (notas [x] <=5) {
				 System.out.printf("%s sua nota � %.2f - ainda n�o!\n",nomes[x], notas[x]);
			 }
			 else
			 {
				 System.out.printf("%s sua nota � %.2f - muito bem!\n",nomes[x], notas[x]);
			 }
		 }
		
		
		leia.close();

	}

}
