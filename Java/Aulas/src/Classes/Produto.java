package Classes;

public class Produto {

	// atributos
	// para encapsular um atributo, coloca private.
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque;
	private String editora;

	// CONSTRUTORES
	
	public Produto(String descricao, String codigo, double valorUnitario) {
		super(); //classe mãe 
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}

	// encapsulamento - getter - busca atributo  and setters - altera atributo
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	// METODOS  
	
	public void incluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque += valorSerIncluido;
		
	}
	
	public void tirarEstoque ( int valorSerExcluido) {
		
		if (this.qtdeEstoque >= valorSerExcluido) {
		this.qtdeEstoque -= valorSerExcluido;
		
	} else {
		System.out.println(" Estoque indisponivel...");
	}
	
	}
	
	
	
	
	

}

