Algoritmo "calculadora"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Diego Mendes da Silva (Squad 5)
// Data atual  : 02/10/2021
Var
// Se��o de Declara��es das vari�veis 

    num1 : real
    num2 : real
    resultado : real
    sinal : caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

   escreval("Escolha o operador da tabuada, ex. (+, -, x, /, ^): ")
   leia(sinal)
   escreval("")
   escreval("Escolha o primeiro n�mero: ")
   leia(num1)
   escreval("")
   escreval("Escolha o segundo n�mero: ")
   leia(num2)
   escreval("")
   escreval(num1, " " ,sinal, " " , num2)
   
   escolha sinal
   caso "+"
        escreva("O resultado da conta �: " , num1 + num2)
        escreval("")
   caso "-"
        escreva("O resultado da conta �: " , num1 - num2)
        escreval("")
   caso "*"
        escreva("O resultado da conta �: " , num1 * num2)
        escreval("")
   caso "/"
        escreva("O resultado da conta �: " , num1 / num2)
        escreval("")
   caso "^"
        escreva("O resultado da conta �: " , num1 ^ num2)
        escreval("")
   fimescolha
   
   

Fimalgoritmo