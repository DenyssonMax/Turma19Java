package Classes;

public class Cavalo extends Animal {
	
	// atributos 
	
	private boolean deveCorrer;

	
		// construtor 
	public Cavalo(String nome, int idade, boolean emiteSom, boolean deveCorrer) {
		super(nome, idade, emiteSom);
		this.deveCorrer = deveCorrer;
	}

	// encapsulamento 
	
	public boolean isDeveCorrer() {
		return deveCorrer;
	}


	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	
	// metodo
	
	

}
