Algoritmo "semnome"

// 6 - O custo de um carro novo ao consumidor é a soma do custo de fábrica com
// a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
// escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever
// o custo final ao consumidor.
Var
// Seção de Declarações das variáveis 
distribuidor, imposto, final:real
fabrica:inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Escreva o preço de fabrica do veiculo:")
leia(fabrica)

distribuidor <- (fabrica*0.28)
imposto <- (fabrica*0.45)

final <- (fabrica + distribuidor + imposto)

escreval("O valor final do produto e de ", final, " reais.")



Fimalgoritmo