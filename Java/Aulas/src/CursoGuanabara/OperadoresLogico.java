package CursoGuanabara;

public class OperadoresLogico {

	public static void main(String[] args) {
		
		int x, y, z;
		x = 3;
		y = 5;
		z = 14;
		boolean r;    // && - e  || - ou ,  ^ ou exclusivo. ! nao.
		r = (x<y) ^ y==z ? true : false; 
		System.out.println("O resultado para sua condição é?  " +r);
		
		
	}

}
