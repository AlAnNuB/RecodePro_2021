Algoritmo "Em qual rede social postar?"

Var
   resposta,trabalho_pessoal:caractere
Inicio
   escreval("Antes de postar algo responda esse question�rio!")
   escreval
   escreval("As pessoas podem ler?")
   leia(resposta)
   se(resposta="nao")entao
      escreval("Posta no Google+")
   senao
      escreval("Voc� esta no bar?")
      leia(resposta)
      se(resposta="sim")ent�o
         escreval("Posta no Four Square")
      senao
         escreval("�  trabalho ou pessoal?(digite apenas TRABALHO ou PESSOAL.)")
         leia(trabalho_pessoal)
         se(trabalho_pessoal="trabalho")entao
            escreval("� dif�cil de explicar pro chefe?")
            leia(resposta)
            se(resposta="sim")ent�o
               escreval("Ent�o n�o poste")
            senao
               escreval("� chato?")
               leia(resposta)
               se (resposta="sim")entao
                  escreval("Se � chato posta no Linkedin")
               senao
                  escreval("quer saber se as pessoas v�o gostar?")
                  leia(resposta)
                  se (resposta="sim")entao
                     escreval("Posta no Facebook")
                  senao
                     escreval("Ent�o posta no Twiter")
                  fimse
               fimse
            fimse
         senao
            escreval("� dificil explicar para a fam�lia?")
            leia(resposta)
            se (resposta="sim")entao
               escreval("Enta� n�o poste!!")
            senao
               escreval("Voc� quer saber se as pessoas v�o gostar?")
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