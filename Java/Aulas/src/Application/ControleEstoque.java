package Application;

import java.util.Locale;

import Classes.Doce;
import Classes.Produto;
import Classes.Revista;
import Classes.Roupa;

public class ControleEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Produto prod1 = new Produto("CAMISA", "XL001", 100.25);
		Revista prod2 = new Revista("Craudia", " RR0024", 25.50, "Abril");
		Roupa prod3 = new Roupa("CALÇA", "XLQ001", 90, "ZARA");
		Doce prod4 = new Doce("BALA", "XL004", 4.20, "ACCOR");

		
		
	
		prod1.setQtdeEstoque(10);
		

		System.out.println(prod1.getDescricao() + " R$ " + prod1.getValorUnitario() + ". Quantidade em estoque: "
				+ prod1.getQtdeEstoque() + " unidades ");
		prod1.tirarEstoque(5);
		System.out.println(" A quantidade de estoque atual é: " + prod1.getQtdeEstoque() + "\n E o valor total é: ");

	}
}
