Algoritmo "semnome"
// 
// 10 - Uma Empresa de vendas de softwares paga a seu vendedor um fixo de R$
// 1200,00 por m�s, mais uma comiss�o de 15% pelo seu valor de vendas no m�s.
// Fa�a um algoritmo que leia o valor da venda e determine o sal�rio total do
// funcion�rio. Mostre as informa��es que voc� achar necess�rio.
Var
// Se��o de Declara��es das vari�veis 
 fixo, vendas, salariofinal, comissao:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
fixo <- 1200

escreval("Digite o valor das vendas:")
leia(vendas)

comissao <- (vendas*0.15)

escreval("O salario final do funcionario sera de R$",(vendas+comissao))


Fimalgoritmo