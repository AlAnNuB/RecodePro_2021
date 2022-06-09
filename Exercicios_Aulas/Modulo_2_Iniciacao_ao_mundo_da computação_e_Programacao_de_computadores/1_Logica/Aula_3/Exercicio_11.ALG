Algoritmo "Exercicio_11"

Var

desconto, valorProduto, valorAtualizado:real

Inicio
escreva("Digite o valor do produto: ")
     leia(valorProduto)

// desconto <- (valorProduto*15)/100 pra pegar 15% de valor produto
desconto <- (valorProduto*0.15)
valorAtualizado <- (valorProduto-desconto)

se (valorAtualizado >= 500) entao
     escreval("O produto esta Caro.")
senao
     escreval("O produto esta Barato")

fimse

Fimalgoritmo