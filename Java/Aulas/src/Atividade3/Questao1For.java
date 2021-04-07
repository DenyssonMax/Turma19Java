package Atividade3;

import java.util.Scanner;

public class Questao1For {

	/*
	 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
	 * resto = 5. (FOR)
	 */
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros;
		int resto;

		for (int x = 1000; x < 1999; x++) {
			resto = (x % 11);
			if (resto == 5) {
				System.out.println("Os números com resto 5 são: " + x);
			}

		}

	}

}
