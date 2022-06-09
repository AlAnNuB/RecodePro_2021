using System;

namespace Exercicio02
{
    class Program
    {
        static void mensagem(){
            Console.WriteLine("Segura na mão de Deus!");
        }
        static void digita(){
             Console.WriteLine("Digite um valor: ");
             String digita = Console.ReadLine();
             Console.WriteLine("O valor digitado foi: " + digita);
        }
        static void Main(string[] args)
        {
            mensagem();
            digita();
            /*
            Fazer um programa para criar um método que irá exibir uma mensagem qualquer, depois criar um outro método que irá receber uma informação via console em uma variavel do tipo string e deverá exibir o que foi escrito.
            */

        }
    }
}
