programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real n1, n2, n3, n4,quad1,quad2, quad3, quad4
	
		escreva("Oii, escreva quatro numeros:\n")
		leia(n1, n2, n3, n4)

	quad1 = mat.potencia(n1, 2)


	quad2 = mat.potencia(n2, 2)
		
	
	quad3 = mat.potencia(n3, 2)
		
	
	quad4 = mat.potencia(n4, 2)
		

		se (quad3 >= 1000){
		escreva("\nO resulta do para o seu terceiro numero ",n3," é: ",quad3)

		} 
	
	senao {

		escreva("\nOquadrado do primeiro numero ",n1," é : ",quad1)
		escreva("\nOquadrado do segundo numero ",n2," é : ",quad2)
		escreva("\nOquadrado do terceiro numero ",n3," é : ",quad3)
		escreva("\nOquadrado do quarto numero ",n4," é : ",quad4)
	}
	
		
	}
	
}




/*
*
*Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */