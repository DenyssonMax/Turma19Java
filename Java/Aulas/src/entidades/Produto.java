package entidades;

public class Produto {

	public static Object nome;
	public String name;
	public double preco;
	public int quantidade;
	

	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}
	
	public void adcProduto ( int quantidade) {
		this.quantidade += quantidade;	
	}
	
	public void saidaProduto (int quantidade) {
		this.quantidade -= quantidade;	
	}
	
	public String toString () {
		return name + ", R$" + String.format("%.2f", preco) +", " + quantidade + " unidades, Total: R$" + String.format("%.2f", valorTotalNoEstoque());
				
	}
	
	
}
