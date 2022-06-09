Algoritmo "Exercicio_1"


Var

i, valor, dentro, fora:inteiro

Inicio

para i de 1 ate 10 faca
escreval("Digite um valor: ")
leia(valor)

se((valor >= 10) e (valor <= 20 )) entao
   dentro <- dentro + 1
senao
     fora <- fora +  1
fimse
fimpara
escreval("O valor dentro do intervalo:", dentro)
escreval("O valor fora do intervalo:", fora)
Fimalgoritmo