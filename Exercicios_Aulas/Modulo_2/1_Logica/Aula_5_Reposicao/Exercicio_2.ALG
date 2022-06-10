Algoritmo "Exercicio_2"
//  
//  
// Escreva um algoritmo para ler 10 números.
// Todos os números lidos com valor inferior a 40 devem ser somados.
// Escreva o valor final da soma efetuada.

Var

i, valor, dentro, soma:inteiro

Inicio

para i de 1 ate 10 faca
escreval("Digite um valor: ")
leia(valor)

se(valor < 40) entao
   dentro <- dentro + 1
   soma <- soma + valor

fimse
fimpara
escreval("Voce digitou ",dentro," numeros menores que 40 ")
escreval("O valor da soma desses numeros e:",soma)

Fimalgoritmo