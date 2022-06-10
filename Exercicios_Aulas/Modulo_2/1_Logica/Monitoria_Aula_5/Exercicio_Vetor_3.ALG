Algoritmo "Exercicio_Vetor_3"
// 
//  
// Usando o vetor e o para, leia 5 notas
// e mostre a media das 5 notas no final
Var

vet: vetor[1..5] de inteiro
i, soma:inteiro
media:real
Inicio

para i de 1 ate 5 faca
     escreval("Digite a nota",i)
     leia(vet[i])
      soma <- (soma + vet[i])
fimpara
       media <- (soma / 5)
escreval("A media de nota desse aluno e", media)



Fimalgoritmo