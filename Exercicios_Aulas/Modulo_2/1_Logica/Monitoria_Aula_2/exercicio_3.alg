Algoritmo "semnome"
//
//
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/9/2021
Var
   // Se��o de Declara��es das vari�veis

  velocidade, multa:real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Digite avelocidade: ")
      leia(velocidade)
se (velocidade >= 80) entao
    escreval("Voce sera multado.")
multa<-(velocidade-80)*7
    escreval("O valor da multa  de: ", multa)
senao
     escreval("Voce nao sera multado.")
fimse
Fimalgoritmo