Algoritmo "sorteio"
//  
//  
Var
   numeroUsuario1, numeroUsuario2, numeroUsuario3: inteiro
   numeroUsuario4, numeroUsuario5, numeroUsuario6: inteiro

   numeroSorteado1, numeroSorteado2, numeroSorteado3: inteiro
   numeroSorteado4, numeroSorteado5, numeroSorteado6: inteiro

   i, c, r, num, numero, numerosAcertados:inteiro

Inicio

   repita
      escreval("--Menu--")
      escreval("[0] - Fechar jogo ")
      escreval("[1] - Apostar")
      escreva("Escolha uma opção:  ")
      leia(r)

      se( r = 1 ) entao
         numerosAcertados <- 0

         numeroUsuario1 <- 0
         numeroUsuario2 <- 0
         numeroUsuario3 <- 0
         numeroUsuario4 <- 0
         numeroUsuario5 <- 0
         numeroUsuario6 <- 0

         numeroSorteado1 <- 0
         numeroSorteado2 <- 0
         numeroSorteado3 <- 0
         numeroSorteado4 <- 0
         numeroSorteado5 <- 0
         numeroSorteado6 <- 0
         
         i <- 1
         c <- 1
         
         escreva("Digite 6 numeros de 1 a 60 para fazer sua aposta : ")

         enquanto i <= 6 faca
            leia(numero)
            se( (numero <= 0) ou (numero > 60) )entao
               escreval("Aposta invalida")
            senao
               se((numero <> numeroUsuario1) e (numero <> numeroUsuario2) e (numero <> numeroUsuario3) e (numero <> numeroUsuario4) e (numero <> numeroUsuario5) e (numero <> numeroUsuario6))  entao
                  escolha i
                  caso 1
                     numeroUsuario1 <- numero
                  caso 2
                     numeroUsuario2 <- numero
                  caso 3
                     numeroUsuario3 <- numero
                  caso 4
                     numeroUsuario4 <- numero
                  caso 5
                     numeroUsuario5 <- numero
                  caso 6
                     numeroUsuario6 <- numero
                  fimescolha

                  i <- i + 1

               senao

                  escreval("Você já apostou nesse numero")

               fimse
            fimse

         fimenquanto

         escreval(" ")

         escreval("Sua aposta foi: ")
         escreval(numeroUsuario1," ",numeroUsuario2," ",numeroUsuario3," ",numeroUsuario4," ",numeroUsuario5," ",numeroUsuario6)

         enquanto c <= 6 faca
            num <- randi(61)

            se( (num > 0) e (num <= 60) )entao
               se((num <> numeroSorteado1) e (num <> numeroSorteado2) e (num <> numeroSorteado3) e (num <> numeroSorteado4) e (num <> numeroSorteado5) e (num <> numeroSorteado6))entao

                  se((num = numeroUsuario1) ou (num = numeroUsuario2) ou (num = numeroUsuario3) ou (num = numeroUsuario4) ou (num = numeroUsuario5) ou (num = numeroUsuario6))entao
                     numerosAcertados <- numerosAcertados + 1
                  fimse

                  escolha c
                  caso 1
                     numeroSorteado1 <- num
                  caso 2
                     numeroSorteado2 <- num
                  caso 3
                     numeroSorteado3 <- num
                  caso 4
                     numeroSorteado4 <- num
                  caso 5
                     numeroSorteado5 <- num
                  caso 6
                     numeroSorteado6 <- num
                  fimescolha

                  c <- c + 1

               fimse
            fimse

         fimenquanto

         escreval(" ")
         escreval("O resultado final foi: ")
         escreval(numeroSorteado1," ",numeroSorteado2," ",numeroSorteado3," ",numeroSorteado4," ",numeroSorteado5," ",numeroSorteado6)
         escreval(" ")
         escreval("Você acertou ",numerosAcertados," numeros")
         escreval(" ")

      senao
         se( r = 0)entao
            escreval("Fim do jogo")
         senao
            escreval(" ")
            escreval("Opção invalida.")
            escreval(" ")
         fimse
      fimse

   ate r = 0
Fimalgoritmo