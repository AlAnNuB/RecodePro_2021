Algoritmo "calculadora"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Diego Mendes da Silva (Squad 5)
// Data atual  : 02/10/2021
Var
// Seção de Declarações das variáveis 

    num1 : real
    num2 : real
    resultado : real
    sinal : caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreval("Escolha o operador da tabuada, ex. (+, -, x, /, ^): ")
   leia(sinal)
   escreval("")
   escreval("Escolha o primeiro número: ")
   leia(num1)
   escreval("")
   escreval("Escolha o segundo número: ")
   leia(num2)
   escreval("")
   escreval(num1, " " ,sinal, " " , num2)
   
   escolha sinal
   caso "+"
        escreva("O resultado da conta é: " , num1 + num2)
        escreval("")
   caso "-"
        escreva("O resultado da conta é: " , num1 - num2)
        escreval("")
   caso "*"
        escreva("O resultado da conta é: " , num1 * num2)
        escreval("")
   caso "/"
        escreva("O resultado da conta é: " , num1 / num2)
        escreval("")
   caso "^"
        escreva("O resultado da conta é: " , num1 ^ num2)
        escreval("")
   fimescolha
   
   

Fimalgoritmo