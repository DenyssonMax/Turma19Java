programa
{
	
	funcao inicio()
	{

	real E, salario1, horaTrabalho, salario2
	inteiro hora1 = 10, hora2 = 20
	
	
		escreva("Olá, quantas horas você trabalhou essa semana? \n Digite aqui: ")
		leia(horaTrabalho)

	
			salario1 =  horaTrabalho * hora1
			
		se (horaTrabalho <= 50){
			escreva(" Trabalhou pouco hem parceiro. Essa semana você vai receber:R$ ",salario1)}

		senao se  (horaTrabalho > 50){
			
			salario2 = horaTrabalho * hora2
		
			escreva(" Seu salário essa semana seria R$", salario1,". Mas como voce trabalhou igual um camelo vai receber R$", salario2," a mais!") }

		
		}
	}

/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*\
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */