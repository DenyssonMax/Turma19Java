programa
{
	
	funcao inicio()
	{

	inteiro diasVidas 
	cadeia nome 
	

	escreva("Olá, escreva seu nome: ")
	leia(nome)
	limpa()

	escreva(nome," quantos dias de vida você tem:  ")
	leia(diasVidas)
	limpa()

	inteiro anos = diasVidas / 365 
	inteiro meses = diasVidas%365/30
	inteiro dias = diasVidas%365%30

	
	escreva(nome, " ,você tem mais ou menos ", anos," anos " ,meses, " meses e " ,dias , " dias na terra!!")


	}

	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */