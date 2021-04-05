package cursoUdemy;

import java.util.Scanner;

public class exemplosIfElse {
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner (System.in);
		int hora;
		
		System.out.print("Que horas são? - ");
		hora = sc.nextInt();
		
		if ( hora < 12 ) {       // caso o if ou else tenha apenas um comando, as {} são opcionais. 
			System.out.println("Bom Dia");

			}
		else if ( hora < 18 ) {
			System.out.println("Boa Tarde princesa da disney ");
					
					}
		else {
			System.out.println("Boa Noite coisa linda!! > <");
					}
		
		}
}
