Algoritmo "semnome"
// 
// 9 - Duas vari�veis (A e B) possuem valores distintos (A:=5 e B:= 10), crie um
// algoritmo que armazene esses dois valores nessas duas vari�veis, e efetue atroca dos valores de forma que a vari�vel A passe a possuir o valor da vari�vel
// B e que a vari�vel B passe a possuir o valor da vari�vel A. Por fim, apresentar
// os valores trocado.
Var
// Se��o de Declara��es das vari�veis 

 a, b, c:inteiro
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
a <- 5
b <- 10

c <- a
a <- b
b <- c

escreval(a)
escreval(b)
Fimalgoritmo