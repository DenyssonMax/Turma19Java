package CursoGuanabara;

public class ComparacaoString {

	public static void main(String[] args) {
	
		
		String nome1 = "Denysson";
		String nome2 = "Denysson";
		String nome3 = new String ("Denysson");
		String res;
		
		//res = (nome1 == nome3)? "iguais":"diferentes";
		// para verificar se o conteudo de um objeto � igual ao do outro,
		// usa-se a opera��o .equals  
		
		res = (nome1.equals(nome3))? "iguais":"diferentes";
		
		System.out.println("Os nomes digitados s�o: "+ res);

	}

}
