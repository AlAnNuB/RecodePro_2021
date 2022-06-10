Algoritmo "semnome"

Var


vet: vetor[1..5] de inteiro
vetNome: vetor[1..5] de caractere
i:inteiro
posicao:inteiro
Inicio

vet[1] <- 1
vet[2] <- 6
vet[3] <- 2
vet[4] <- 4
vet[5] <- 5

escreval(vet[2])

para i de 1 ate 5 faca
     escreval("Vetor na posição Nº", i)
     escreval(vet[i])
fimpara

escreval()

vetNome[1] <- "Caio"
vetNome[2] <- "Caioba"
vetNome[3] <- "Caiao"
vetNome[4] <- "Caiox"
vetNome[5] <- "Cain"

para i de 1 ate 5 faca
     escreval("Vetor na posição Nº", i)
     escreval(vetNome[i])
fimpara

escreval("Digite uma posição")
leia(posicao)

escreval(vetNome[posicao])

Fimalgoritmo