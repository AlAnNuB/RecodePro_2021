Algoritmo "semnome"
//  
//  

Var
   resposta, resposta2: caractere


Inicio
   escreval("Voc� quer que algu�m leia ?")
   leia(resposta)

   se (resposta = "n�o") ent�o
      escreval("Publique no Google Plus")
   sen�o
      se (resposta = "sim") ent�o
         escreval("Voc� est� no bar ?")
         leia(resposta)
         se(resposta = "sim") ent�o
            escreval("Publicar no Four Square!")
         sen�o
            se(resposta = "nao") ent�o
               escreval ("� do trabalho?")
               leia(resposta)
               se(resposta = "nao") ent�o
                  escreval("� pessoal?")
                  leia(resposta)
                  se (resposta = "sim") ent�o
                  //escreva("Vai ser dif�cil explicar para seus pais ou par?")
                  //se (resposta2 = "n�o") ent�o
                  // escreva("Voc� quer saber se outra pessoa vai gostar?")
                  escreval("Vai ser dif�cil explicar para o chefe?")
                  leia(resposta)
                  se (resposta = "sim") ent�o
                     escreval("N�o posta!!")
                  sen�o
                     se (resposta = "nao") ent�o
                        escreval("� chato?")
                        leia(resposta)
                        se (resposta = "sim") ent�o
                           escreval("Postar no Linkdin")
                           se(resposta = "nao")
                              escreval("Voc� quer saber se outra pessoa vai gostar?")
                              se (resposta = "sim") ent�o
                                 escreval("Publicar no Facebook")
                              sen�o (resposta = "nao") ent�o
                                 escreval("Publicar no Twitter")

                              fimse
                           fimse
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
fimse



Fimalgoritmo