programa
{
	
	funcao inicio()
	{

	inteiro ano, idade, mes, dias 
	cadeia nome 
	ano=365

	escreva("Olá, escreva seu nome: ")
	leia(nome)
	limpa()

	escreva(nome," quantos anos você tem: ")
	leia(idade)
	limpa()

	inteiro anos = ano * idade

	escreva(" Quantos meses: ")
	leia (mes)
	limpa()

	inteiro meses = mes * 30
	 
	escreva("Quantidade de dias do mês que você está: ")
	leia(dias)
	limpa()
	
	
	escreva(nome, " ,você tem mais ou menos ", anos + meses + dias , " dias na terra!!")

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */