Algoritmo "semnome"
// 4 - Fa�a um algoritmo que leia um valor de um produto e
// mostre um novo valor
// deste produto atualizado, para o novo valor dever�
// ser concedido o desconto de 25%.
Var
// Se��o de Declara��es das vari�veis 
  valor, desconto:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  escreval("Digite um valor: ")
  leia(valor)
  
  desconto <- (valor*0.25)
  
  escreval("O valor com desconto e: ",(valor-desconto))

Fimalgoritmo