Algoritmo "menu"
//
//
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/10/2021
Var
   // Se��o de Declara��es das vari�veis.
   ALTURA,PESO,IMC:REAL   //<---vari�veis para o c�lculo do imc.
   resp:inteiro //<---vari�vel para o menu de sele��o.
   n,fat,cont:inteiro //<---vari�veis para o c�lculo fatorial.
Inicio

   escreval("Digite 0,1 ou 2 para op��o desejada:")
   escreval("0-Desligar o programa")
   escreval("1-Calcular imc")
   escreval("2-Calcular fatorial")
   leia(resp)
   se((resp<0) ou (resp>2)) entao
      repita
         escreval("resposta inv�lida digite a op��o correta!")
         leia(resp)
      ate ((resp>=0)e(resp<=2))
   fimse
   // o bloco acima testa se a resposta esta entre 0 e 2,caso n�o esteja repete.

   se (resp=1)entao
      ESCREVAL("Digite a sua altura:")
      LEIA(ALTURA)
      ESCREVAL("Digite seu peso:")
      LEIA(PESO)

      IMC<-PESO/(ALTURA^2)

      SE IMC<18.5 ENTAO
         ESCREVAL("Abaixo do peso!")
      SENAO
         SE ((IMC>=18.6) E (IMC<=24.9)) ENTAO
            ESCREVAL("Peso Normal!")
         SENAO
            SE ((IMC>=25) E (IMC<=29.9)) ENTAO
               ESCREVAL("Sobrepeso!")
            SENAO
               SE ((IMC>=30) E (IMC<=34.9)) ENTAO
                  ESCREVAL("Obesidade Grau I!")
               SENAO
                  SE ((IMC>=35) E (IMC<=39.9)) ENTAO
                     ESCREVAL("Obesidade Grau II!")
                  SENAO
                     SE ((IMC>=40)) ENTAO
                        ESCREVAL("Obesidade Grau III!")

                     FIMSE
                  FIMSE
               FIMSE
            FIMSE
         FIMSE
      FIMSE
      //caso a resposta seja  1 o bloco acima calcula o imc .
   senao
      se (resp=2)  entao
         escreval("Digite um n�mero para saber o fatorial:")
         leia(n)
         fat<-1
         para cont de 1 ate n  faca
            fat<-fat*cont
            escreva(cont,"x")
         fimpara
         escreval(" o fatorial de",n," �: ",fat)
         //caso a resposta seja 2 o bloco acima calcula o fatorial.
      senao
         se(resp=0)entao
            escreval("At� a proxima :D")
         fimse
      fimse
   fimse

fimalgoritmo