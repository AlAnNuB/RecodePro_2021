using System;

namespace Exercicio04
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Programa número 1: fazer um programa em C# para que um valor seja digitado no console pelo usuário e o programa verifique se o número digitado é impar ou par. */

            Console.WriteLine("Digite um número:");
            int numero = Console.ReadLine();
            if(numero %2 == 0){
                 Console.WriteLine("O número digitado foi: " + numero + " e ele é Par.");
            }else{
                Console.WriteLine("O número digitado foi: " + numero + " e ele é Impar.");
            }
        }
    }
}
