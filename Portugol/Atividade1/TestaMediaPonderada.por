programa
{
	
	funcao inicio()
	{

	real n1, n2, n3, media 
	cadeia nome

	escreva("Olá, escreva seu nome: ")
	leia(nome)

	escreva(nome, " agora vamos calcular a sua média")
	leia(nome)

	escreva("Escreva sua primeira nota: ")
	leia(n1)
	limpa()

	escreva("Agora escreva sua segunda nota: ")
	leia(n2)
	limpa()

	escreva("Por fim, escreva sua ultima nota: ")
	leia(n3)
	limpa()


	 media = (n1 * 2.3 + n2 * 5 + n3 * 2.3) / 9.6
		
	 
	escreva(nome ," Baseado em suas notas. Sua média final é: ",media)
	
	 se (media >= 7) { 
		 escreva("\n Aprovado!!") }
		senao {
		escreva("\n Reprovado.") }
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */