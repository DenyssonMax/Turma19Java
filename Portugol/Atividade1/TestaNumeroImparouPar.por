programa
{
	
	funcao inicio()
	{
	inteiro numero
	
		escreva("Olá, escreva um numero:")
		leia(numero)

		se (numero == 0) {
			escreva(" Zero é neutro ") 
		}
		senao se (numero < 0){
			escreva(" Número negativo, não posso calcular!")
		}

		senao se (numero % 2 == 0){
			
			escreva(" Seu numero é par!")
			
		} senao {

			escreva(" Seu numero é impar")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */