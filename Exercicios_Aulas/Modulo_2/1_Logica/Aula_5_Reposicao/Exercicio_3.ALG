Algoritmo "Exercicio_3"
// 
//  
// Uma loja está levantando o valor total de todas as
// mercadorias em estoque. Escreva um algoritmo
// que permita a entrada das seguintes informações:
// a) o número total de mercadorias no estoque;
// b) o valor de cada mercadoria.
// Ao final imprimir o valor total em estoque
// e a média de valor das mercadorias

Var

total,valor,media, soma:real
mercadorias, i:inteiro

Inicio

escreval("Digite o numero total de mercadorias no estoque: ")
   leia(mercadorias)
   
para i de 1 ate mercadorias faca

  escreval("O valor do ",i," produto:")
  escreval(" ")
  leia(total)
  
  soma <- soma+total
  
fimpara

   media <- soma/mercadorias
 
 escreval("O numero total de de produtos no estoque e: ",mercadorias)
 escreval("O valor total dos produtos no estoque e: R$",soma)
 escreval("A media de valores e: R$", media)

Fimalgoritmo