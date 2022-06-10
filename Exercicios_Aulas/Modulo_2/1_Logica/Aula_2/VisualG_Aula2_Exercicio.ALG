Algoritmo "semnome"
//  
//  
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/9/2021
Var
// Seção de Declarações das variáveis 

n1,n2,n3:real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("Digite seu peso:")
leia(n1)
escreval("Digite sua altura:")
leia(n2)
n3<-n1/(n2*n2)
escreval (n3)

se (n3<=18.6) entao
   Escreval("Voce esta a baixo do peso")
senao
     se (n3 > 18.6) E (n3<24.9) entao
        escreval("Voce esta com peso normal")
senao
     se (n3>25) E (n3<29.9) entao
        escreval("Voce esta acima do peso")
senao
     se (n3>30) E (n3<34.9) entao
        escreval("voce esta com Obesidade Grau 1")
senao
     se (n3>35) E (n3<39.9) entao
        escreval("Voce esta com Obesidade Grau 2")
senao
     se (n3>=40) entao
        escreval("voce esta com Obesidade Morbida")
fimse
fimse
fimse
fimse
fimse
fimse



Fimalgoritmo