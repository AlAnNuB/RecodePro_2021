Algoritmo "semnome"
// 
// 9 - Duas variáveis (A e B) possuem valores distintos (A:=5 e B:= 10), crie um
// algoritmo que armazene esses dois valores nessas duas variáveis, e efetue atroca dos valores de forma que a variável A passe a possuir o valor da variável
// B e que a variável B passe a possuir o valor da variável A. Por fim, apresentar
// os valores trocado.
Var
// Seção de Declarações das variáveis 

 a, b, c:inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
a <- 5
b <- 10

c <- a
a <- b
b <- c

escreval(a)
escreval(b)
Fimalgoritmo