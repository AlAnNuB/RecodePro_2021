Algoritmo "Menu"

Var

   n, f, fo, fu:inteiro
   p, a, imc:real

Inicio
 repita
 
   escreval("----------Menu-----------")
   escreval("Escolha uma das opçoes:")
   escreval("0 - Desligar o programa.")
   escreval("1 - Calcular o IMC.")
   escreval("2 - Calcular Fatorial.")
   escreval("-------------------------")
   leia(n)

   se ((n < 0) ou (n > 2)) entao
      repita
         escreval("Escolha uma das opçoes:")
         escreval("0 - Desligar o programa.")
         escreval("1 - Calcular o IMC.")
         escreval("2 - Calcular Fatorial.")
         leia(n)
      ate ((n >= 0) ou (n <= 2))
   fimse

   se (n = 0) entao
      escreval("Fim do programa.")
   fimse
   se (n = 1) entao
      escreva("Digite o seu peso:")
      leia(p)
      escreva("Digite sua altura:")
      leia(a)
      imc <- p/(a*a)

      se (imc <= 18.5) entao
         escreval("Sua classificaçao e ABAIXO DO PESO")
      senao
         se((imc > 18.6) e (imc < 24.9)) entao
            escreval("Sua classificaçao e PESO NORMAL")
         senao
            se((imc > 25) e (imc < 29.9)) entao
               escreval("Sua classificaçao e SOBREPESO")
            senao
               se((imc > 30) e (imc < 34.9)) entao
                  escreval("Sua classificaçao e OBESIDADE I")
               senao
                  se((imc > 35) e (imc < 39.9)) entao
                     escreval("Sua classificaçao e OBESIDADE II")
                  senao
                     se(imc >= 40) entao
                        escreval("Sua classificaçao e OBESIDADE MORBIDA")
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
   
se (n = 2) entao
  escreval("Digite um numero para calcular o fatorial:")
  leia(f)
  
fo <- 1

para fu de f ate 1 passo -1 faca
       fo <- fo*fu
       escreva(fu,"*")
fimpara
escreval(" ")
escreval("O fatorial de ",f, " e ",fo)

fimse

ate (n = 0)

Fimalgoritmo