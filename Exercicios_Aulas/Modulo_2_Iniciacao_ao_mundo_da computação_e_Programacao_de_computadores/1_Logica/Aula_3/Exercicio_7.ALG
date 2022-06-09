Algoritmo "semnome"
// 7 - Faça um programa que leia o nome de um piloto, uma distância percorrida
// em km e o tempo que o piloto levou para percorrê-la (em horas). O programa
// deve calcular a velocidade média em km/h, e exibir a seguinte frase: A
// velocidade média de XX foi YY km/h.—Onde XX é o nome do piloto, e YY é sua
// velocidade média.
Var
// Seção de Declarações das variáveis 
nome:caractere
km:real
hora:real
media:real

Inicio

// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite o nome do piloto:")
leia(nome)

escreval("Digite a distancia percorrida em Km:")
leia(km)

escreval("Escreva o tempo que o piloto levou no trajeto: ")
leia(hora)

media <- (km*hora)

escreval("A velocidade media de ",nome," e de ",media," Km/h")

Fimalgoritmo