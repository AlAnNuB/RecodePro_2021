Algoritmo "Exercicio_14"


Var

tipoInvest:inteiro
valorInvest, valorCor:real

Inicio

escreva("Digite o valor a ser investido: ")
     leia(valorInvest)
escreval("Selecione o tipo de investimento. ")
escreval("1-Poupança ou 2-Renda Fixa")
     leia(tipoInvest)

se (tipoInvest = 1) entao

// valorCor <- valorInvest + (valorInvest/100*5) =>50%
   valorCor <- (valorInvest + (valorInvest*0.5) )
senao
se (tipoInvest = 2) entao

// valorCor <- valorInvest + (valorInvest/100*10) =>10%
   valorCor <- (valorInvest + (valorInvest*0.10))
fimse
fimse

escreva("O valor corrigido e de: R$", valorCor)

Fimalgoritmo