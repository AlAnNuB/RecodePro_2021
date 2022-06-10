Algoritmo "Exercicio_4"
// 
//  
// Faça um algoritmo em que o usuário digitando o nome, nota 1,
// nota 2, nota 3 e nota 4 de 3 alunos . Determine e imprima o nome
// e a média de cada aluno, e a média aritmética final de todos os
// alunos.
Var

nome:caractere
nota,nota2, nota3, nota4, media, soma, total:real
n, i:inteiro
Inicio

para i de 1 ate 4 faca
    escreval("Digite o nome do ",i," aluno:")
    leia(nome)
    escreval("Digite a primeira nota :")
    leia(nota)
    escreval("Digite a segunda nota :")
    leia(nota2)
    escreval("Digite a terceira nota :")
    leia(nota3)
    escreval("Digite a quarta nota :")
    leia(nota4)

soma <- nota + nota2+nota3+nota4

media <- soma/4

escreval("O aluno: ", nome)
escreval("A media desse aluno e  ", media)
fimpara

total <- (total+ media)/4
escreval("-------------------------------------------------")
escreval("A media total de todos os alunos e: ", total)

Fimalgoritmo