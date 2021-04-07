package cursoUdemy;

import java.util.Locale;
import java.util.Scanner;
import entidades.triangulo;


public class areaTriangulo {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		triangulo x, y;
	
		x = new triangulo();
	
		y = new triangulo();
	
		System.out.println("Escreva as medidas do triangulo X: ");
	
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
	
		System.out.println("Escreva as medidas do triangulo Y: ");
	
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		double areaX = x.area();
		double areaY = y.area();
	}
}

