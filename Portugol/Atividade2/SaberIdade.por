programa
{
	
	funcao inicio()
	{

	real pesoTomate, excesso, multa, multaTotal
	
		escreva("Olá, por favor informe quantos KG de tomates você pegou: ")
		leia(pesoTomate)

		se (pesoTomate <= 50) {
			escreva(" Boa meu jovem. Você vai pagar apenas o que comprou")
		}

		senao se (pesoTomate > 50){
			multa = 4.00
			excesso = pesoTomate - 50
			multaTotal = excesso * multa
			
			escreva(" Não deu certo dessa vez. você excedeu o limite. Vai pagar: R$ ",multaTotal, " de multa pelo excesso de peso")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 13; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */