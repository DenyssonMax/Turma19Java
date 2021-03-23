programa
{
	
	funcao inicio()
	{
	
    inteiro tempoTotal
    
    escreva("Olá, fala pra mim quanto tempo em segundos, terá seu evento: ")
    leia(tempoTotal)
    limpa()

  	inteiro horas =  tempoTotal/(60*60)
   	inteiro minutos = tempoTotal%(60*60)/60
    inteiro segundos = tempoTotal%(60*60)%60


    escreva("O tempo total do seu evento será " ,horas," horas,", minutos ," minutos", segundos ," segundos!!")

		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */