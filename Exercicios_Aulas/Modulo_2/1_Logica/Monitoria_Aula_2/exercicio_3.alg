Algoritmo "semnome"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/9/2021
Var
   // Seção de Declarações das variáveis

  velocidade, multa:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
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