programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{

	cadeia nome
	real temperaturaF

	escreva("Olá, escreva seu nome:" )
	leia(nome)
	limpa()
	
	escreva("Qual a temperatura em Fahrenheit: ")
	leia(temperaturaF)
	limpa()

	real temperaturaC = Matematica.arredondar (     ((temperaturaF - 32)/1.8), 2)
	
	escreva(nome,"A temperatura em Celcius é = ",temperaturaC)		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */