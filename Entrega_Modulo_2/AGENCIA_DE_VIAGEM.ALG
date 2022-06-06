Algoritmo "Agencia_de_Viagem"
// 
// Usando Pseudocódigo:
// Usando conceitos de programação estruturada (Vetor),
// criar em pseudocódigo um menu para simular um cadastro para
// uma agência de viagens com os seguintes dados: cadastro de
// cliente e cadastro de destino, criar também uma consulta
// para cada estrutura de dados

Var

cliente: vetor[1..5] de caracter
destino: vetor[1..5] de caracter
i, menu: inteiro


Inicio

repita
menu <- 0
escreval("----------------------------------------------")
escreval("Seja bem vindo! Viagens Segura Na Mao De Deus")
escreval("----------------------------------------------")
escreval("Selecione uma opçao: ")
escreval("1 - Cadastrar 5 novos clientes")
escreval("2 - Exibir clientes cadastrados")
escreval("3 - Sair do programa")
leia(menu)

se menu = 1 entao
escreval("----------------------------------------------")
escreval("Cadastre os 5 clientes e seus destinos:")
escreval("----------------------------------------------")
   para i de 1 ate 5 faca
       escreval("Digite o nome do ",i," cliente: ")
       leia(cliente[i])
       escreval("Digite o destino do ",i," cliente:")
       leia(destino[i])
   fimpara
senao

se menu = 2 entao
    para i de 1 ate 5 faca
         se cliente[i] = "" entao
            escreval("Nao tem nenhum cliente cadastrado!")
            interrompa
         senao
       escreval("O nome do ",i," cliente e ",cliente[i])
       escreval("O destino do ",i," cliente e ", destino[i])
       fimse
   fimpara
senao
se menu = 3 entao
escreval("----------------------------------------------")
escreval("Obrigado por usar nosse serviços!")
escreval("E nao se esqueça! Viagens Segura Na Mao De Deus")
escreval("----------------------------------------------")

fimse
fimse
fimse

ate menu = 3


Fimalgoritmo