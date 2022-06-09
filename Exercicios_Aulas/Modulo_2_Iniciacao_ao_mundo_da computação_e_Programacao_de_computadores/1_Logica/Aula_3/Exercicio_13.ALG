Algoritmo "semnome"

Var
vSal, nDep, hExtra:inteiro
aDep, vExtra , sBruto:real

Inicio
escreva("Qual seu salario? ")
   leia(vSal)
escreva("Quantos dependentes voce tem ? ")
   leia(nDep)
escreva("Quantas horas extras voce fez?  ")
   leia(hExtra)

aDep <- (nDep*120)
// valor extra = salario dividido por horasMes mais 50%
vExtra <- ((vSal/220)*0.5)

sBruto <- (vSal+aDep+vExtra)
                                                     // :8:2 = 8casas antes da virgula e 2 depois da virgula
escreva("O salario Bruto do funcionario e de R$ ", sBruto:8:2)


Fimalgoritmo