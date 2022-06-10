Algoritmo "semnome"
// 4 - Faça um algoritmo que leia um valor de um produto e
// mostre um novo valor
// deste produto atualizado, para o novo valor deverá
// ser concedido o desconto de 25%.
Var
// Seção de Declarações das variáveis 
  valor, desconto:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  escreval("Digite um valor: ")
  leia(valor)
  
  desconto <- (valor*0.25)
  
  escreval("O valor com desconto e: ",(valor-desconto))

Fimalgoritmo