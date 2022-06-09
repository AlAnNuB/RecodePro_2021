Algoritmo "semnome"
// 
// 8 - Considerando que para um consórcio, sabe-se o número total de prestações,
// a quantidade de prestações pagas e o valor atual da prestação, escreva um
// algoritmo que determine o total pago pelo consorciado e o saldo devedor.

Var
prestacoes:inteiro
pago:inteiro
valorpago:inteiro
valorprestacao:inteiro
totalrestante:inteiro
totaldevedor:inteiro
valorrestante:inteiro

Inicio
escreval("Digite a quantidade total de prestaçoes:")
leia(prestacoes)
escreval("Quantas ja foram pagas?")
leia(pago)
escreval("Digite o valor atual das prestaçoes?")
leia(valorprestacao)

totalrestante <- (prestacoes - pago)
valorpago <- (pago*valorprestacao)
totaldevedor <- (totalrestante*valorprestacao)
valorrestante <- (totaldevedor)

escreval("Voce ja pagou ",pago," parcelas, no valor total de ",valorpago," reais")
escreva(" e ainda tem que pagar", totalrestante," com valor total de ",valorrestante," reais")

Fimalgoritmo