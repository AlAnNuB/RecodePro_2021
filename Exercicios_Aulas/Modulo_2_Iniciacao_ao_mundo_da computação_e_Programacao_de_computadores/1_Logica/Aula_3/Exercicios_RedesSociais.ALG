Algoritmo "Em qual rede social postar?"

Var
   resposta,trabalho_pessoal:caractere
Inicio
   escreval("Antes de postar algo responda esse questionário!")
   escreval
   escreval("As pessoas podem ler?")
   leia(resposta)
   se(resposta="nao")entao
      escreval("Posta no Google+")
   senao
      escreval("Você esta no bar?")
      leia(resposta)
      se(resposta="sim")então
         escreval("Posta no Four Square")
      senao
         escreval("É  trabalho ou pessoal?(digite apenas TRABALHO ou PESSOAL.)")
         leia(trabalho_pessoal)
         se(trabalho_pessoal="trabalho")entao
            escreval("É difícil de explicar pro chefe?")
            leia(resposta)
            se(resposta="sim")então
               escreval("Então não poste")
            senao
               escreval("é chato?")
               leia(resposta)
               se (resposta="sim")entao
                  escreval("Se é chato posta no Linkedin")
               senao
                  escreval("quer saber se as pessoas vão gostar?")
                  leia(resposta)
                  se (resposta="sim")entao
                     escreval("Posta no Facebook")
                  senao
                     escreval("Então posta no Twiter")
                  fimse
               fimse
            fimse
         senao
            escreval("É dificil explicar para a família?")
            leia(resposta)
            se (resposta="sim")entao
               escreval("Entaõ não poste!!")
            senao
               escreval("Você quer saber se as pessoas vão gostar?")
               leia(resposta)
               se(resposta="sim")entao
                  escreval("Posta no facebook")
               senao
                  escreval("Posta no Twiter")
               fimse
            fimse

         fimse
      fimse
   fimse

Fimalgoritmo