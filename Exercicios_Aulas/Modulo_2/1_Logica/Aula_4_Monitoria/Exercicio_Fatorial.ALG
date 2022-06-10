Algoritmo "Exercicio_Fatorial"
//  
//  
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 3/10/2021
Var
// Seção de Declarações das variáveis 
n, loop, fatorial:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite um numero para calcular o fatorial:")
leia(n)
fatorial <- 1
para loop de n ate 1 passo -1 faca
      fatorial <- fatorial*loop
      escreva(loop,"*")
fimpara
      escreval(" ")
       escreval("O fatorial de ",n, " e: ", fatorial)

Fimalgoritmo