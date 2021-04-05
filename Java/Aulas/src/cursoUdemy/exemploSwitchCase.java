package cursoUdemy;

import java.util.Scanner;

public class exemploSwitchCase  {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String dia;
		
		System.out.println("Digite um numero entre 1 e 7 para saber o dia da semana:     '");
		x = sc.nextInt();
		
		switch (x) { // tem a ideia de substituir o if else. minimizando linahs de codigo. 
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default: // caso todas as alternativas anteriores falhem. Semelhante ao else
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
	
