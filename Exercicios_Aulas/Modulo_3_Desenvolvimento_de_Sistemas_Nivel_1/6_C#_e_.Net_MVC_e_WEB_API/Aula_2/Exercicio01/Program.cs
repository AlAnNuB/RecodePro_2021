using System;

namespace Exercicio01
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Fazer um programa para que o usuário possa digitar três números quaisquer e o programa exiba no console qual o maior valor informado. */
            int num1, num2, num3;

            Console.WriteLine("Digite o 1 valor:");
                num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite o 2 valor:");
                num2 = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite o 3 valor:");
                num3 = int.Parse(Console.ReadLine());

            if(num1 > num2 && num1 > num3){
                Console.WriteLine("O primeiro numero é o maior, com valor: " + num1);
            }else if(num2  > num3 && num2 > num1){
                Console.WriteLine("O segundo numero é o maior, com valor: " + num2);
            }else if(num3 > num2 && num3 > num1){
                Console.WriteLine("O terceiro numero é o maior, com valor: " + num3);
            }else{
                 Console.WriteLine("Opção invalida");
            }
        }
    }
}
