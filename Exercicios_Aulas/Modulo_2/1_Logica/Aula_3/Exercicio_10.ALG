Algoritmo "semnome"
// 
// 10 - Uma Empresa de vendas de softwares paga a seu vendedor um fixo de R$
// 1200,00 por mês, mais uma comissão de 15% pelo seu valor de vendas no mês.
// Faça um algoritmo que leia o valor da venda e determine o salário total do
// funcionário. Mostre as informações que você achar necessário.
Var
// Seção de Declarações das variáveis 
 fixo, vendas, salariofinal, comissao:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
fixo <- 1200

escreval("Digite o valor das vendas:")
leia(vendas)

comissao <- (vendas*0.15)

escreval("O salario final do funcionario sera de R$",(vendas+comissao))


Fimalgoritmo