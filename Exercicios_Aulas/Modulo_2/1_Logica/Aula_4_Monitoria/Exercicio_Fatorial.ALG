Algoritmo "Exercicio_Fatorial"
//  
//  
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 3/10/2021
Var
// Se��o de Declara��es das vari�veis 
n, loop, fatorial:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
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