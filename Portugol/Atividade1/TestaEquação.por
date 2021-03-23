programa
{
	
	inclua biblioteca Matematica --> mat 
	funcao inicio()
	{
		real a, b, c, d, ex, f, x, y


		escreva(" Por favor, escreva um valor para as letras a, b, c, d, e e f, respectivamente: \n")
		leia(a, b, c, d, ex, f)

		x = (c*ex - b*f) / (a*ex - b*d) 
		y = (a*f - c*d) / (a*ex - b*d)

		escreva(" O resultado para equação X é: " ,x)
		escreva("\n O resultado para equação Y é: " ,y)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */