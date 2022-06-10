Algoritmo "menu"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/10/2021
Var
   // Seção de Declarações das variáveis.
   ALTURA,PESO,IMC:REAL   //<---variáveis para o cálculo do imc.
   resp:inteiro //<---variável para o menu de seleção.
   n,fat,cont:inteiro //<---variáveis para o cálculo fatorial.
Inicio

   escreval("Digite 0,1 ou 2 para opção desejada:")
   escreval("0-Desligar o programa")
   escreval("1-Calcular imc")
   escreval("2-Calcular fatorial")
   leia(resp)
   se((resp<0) ou (resp>2)) entao
      repita
         escreval("resposta inválida digite a opção correta!")
         leia(resp)
      ate ((resp>=0)e(resp<=2))
   fimse
   // o bloco acima testa se a resposta esta entre 0 e 2,caso não esteja repete.

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
         escreval("Digite um número para saber o fatorial:")
         leia(n)
         fat<-1
         para cont de 1 ate n  faca
            fat<-fat*cont
            escreva(cont,"x")
         fimpara
         escreval(" o fatorial de",n," é: ",fat)
         //caso a resposta seja 2 o bloco acima calcula o fatorial.
      senao
         se(resp=0)entao
            escreval("Até a proxima :D")
         fimse
      fimse
   fimse

fimalgoritmo