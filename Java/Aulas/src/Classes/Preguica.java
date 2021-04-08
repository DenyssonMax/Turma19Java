package Classes;

public class Preguica extends Animal {

	// atributos

	private boolean deveSubir;

	// construtor
	public Preguica(String nome, int idade, boolean emiteSom, boolean deveSubir) {
		super(nome, idade, emiteSom);
		this.deveSubir = deveSubir;
	}

	// encapsulamento 
	public boolean isDeveSubir() {
		return deveSubir;
	}

	public void setDeveSubir(boolean deveSubir) {
		this.deveSubir = deveSubir;
	}

	// metodo 

}
