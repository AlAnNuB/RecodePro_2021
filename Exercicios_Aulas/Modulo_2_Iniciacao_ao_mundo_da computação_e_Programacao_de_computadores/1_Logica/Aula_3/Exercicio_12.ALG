Algoritmo "Exercicio_12"

Var

salario, salarioReaj, reajuste:real

Inicio

escreva("Digite o salario Atual: ")
leia(salario)

se (salario <= 500) entao

// reajuste <- (salario/100)*30 pegar 30% do salario
   reajuste <- (salario*0.30)
   salarioReaj <- (salario+reajuste)
   
   escreval("O seu salario foi reajustado para R$",salarioReaj)

senao
     escreval("O seu salario nao recebeu reajuste!")
     
fimse


Fimalgoritmo