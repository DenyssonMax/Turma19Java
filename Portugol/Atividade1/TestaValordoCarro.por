programa
{
	
	funcao inicio()
	{
		real valorCarro, p1, p2
		inteiro distribuidor
		inteiro imposto
		
		p1 = 0.28
		p2 = 0.45
		
			escreva("Qual foi o valor do seu carro? \n VALOR R$:  ")
			leia(valorCarro)
			limpa()

			distribuidor = valorCarro * p1
			imposto = valorCarro * p2

			escreva("O valor total do seu carro será de: R$ ", valorCarro + distribuidor + imposto)


		
	}
}






/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */