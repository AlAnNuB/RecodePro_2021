Algoritmo "semnome"
// 7 - Fa�a um programa que leia o nome de um piloto, uma dist�ncia percorrida
// em km e o tempo que o piloto levou para percorr�-la (em horas). O programa
// deve calcular a velocidade m�dia em km/h, e exibir a seguinte frase: A
// velocidade m�dia de XX foi YY km/h.�Onde XX � o nome do piloto, e YY � sua
// velocidade m�dia.
Var
// Se��o de Declara��es das vari�veis 
nome:caractere
km:real
hora:real
media:real

Inicio

// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite o nome do piloto:")
leia(nome)

escreval("Digite a distancia percorrida em Km:")
leia(km)

escreval("Escreva o tempo que o piloto levou no trajeto: ")
leia(hora)

media <- (km*hora)

escreval("A velocidade media de ",nome," e de ",media," Km/h")

Fimalgoritmo