Algoritmo "semnome"

// 6 - O custo de um carro novo ao consumidor � a soma do custo de f�brica com
// a porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
// escrever um algoritmo para ler o custo de f�brica de um carro, calcular e escrever
// o custo final ao consumidor.
Var
// Se��o de Declara��es das vari�veis 
distribuidor, imposto, final:real
fabrica:inteiro
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Escreva o pre�o de fabrica do veiculo:")
leia(fabrica)

distribuidor <- (fabrica*0.28)
imposto <- (fabrica*0.45)

final <- (fabrica + distribuidor + imposto)

escreval("O valor final do produto e de ", final, " reais.")



Fimalgoritmo