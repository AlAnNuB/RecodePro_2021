Algoritmo "semnome"
// 5 - Fazer um algoritmo que leia o nome de uma
// pessoa o ano de nascimento e
// o ano atual, e mostre quantos anos essa pessoa t�m.
Var
// Se��o de Declara��es das vari�veis 
nome:caractere
idade,ano, idadeatual:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Digite seu nome:")
leia(nome)
escreval("Em qual ano voce nasceu? ")
leia(idade)
escreval("Em que ano estamos agora? ")
leia(ano)

idadeatual<- (ano-idade)

escreval(nome, " voce tem ", idadeatual," anos de idade")

Fimalgoritmo