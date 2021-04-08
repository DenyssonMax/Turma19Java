package Classes;

public class Revista extends Produto {

	// ATRIBUTOS 
	
	private String editora;

	// Construtor 
	public Revista(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}

	
	// encapsulamento
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	
	
	
	
	
	

}
