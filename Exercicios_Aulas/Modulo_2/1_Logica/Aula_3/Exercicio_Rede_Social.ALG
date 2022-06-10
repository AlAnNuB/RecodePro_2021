Algoritmo "semnome"
//  
//  

Var
   resposta, resposta2: caractere


Inicio
   escreval("Você quer que alguém leia ?")
   leia(resposta)

   se (resposta = "não") então
      escreval("Publique no Google Plus")
   senão
      se (resposta = "sim") então
         escreval("Você está no bar ?")
         leia(resposta)
         se(resposta = "sim") então
            escreval("Publicar no Four Square!")
         senão
            se(resposta = "nao") então
               escreval ("É do trabalho?")
               leia(resposta)
               se(resposta = "nao") então
                  escreval("É pessoal?")
                  leia(resposta)
                  se (resposta = "sim") então
                  //escreva("Vai ser difícil explicar para seus pais ou par?")
                  //se (resposta2 = "não") então
                  // escreva("Você quer saber se outra pessoa vai gostar?")
                  escreval("Vai ser difícil explicar para o chefe?")
                  leia(resposta)
                  se (resposta = "sim") então
                     escreval("Não posta!!")
                  senão
                     se (resposta = "nao") então
                        escreval("É chato?")
                        leia(resposta)
                        se (resposta = "sim") então
                           escreval("Postar no Linkdin")
                           se(resposta = "nao")
                              escreval("Você quer saber se outra pessoa vai gostar?")
                              se (resposta = "sim") então
                                 escreval("Publicar no Facebook")
                              senão (resposta = "nao") então
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