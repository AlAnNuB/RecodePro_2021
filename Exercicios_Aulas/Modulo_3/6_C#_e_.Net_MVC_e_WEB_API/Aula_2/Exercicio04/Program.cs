using System;

namespace Exercicio04
{
  class Program
  {
    static void Main(string[] args)
    {
      /* fazer um programa para que o usuário informe um número até 20 e o programa exiba na tela quantos desses números são pares e ímpares. No final somar o total de números pares com os números ímpares.Lembrando que o valor da variável de controle deve começar com zero, e o zero não deve ser computado. Computar apenas a partir do número 1. */
      int num, par = 0, impar = 0, somaPar = 0 , somaImpar = 0;

      Console.WriteLine("Digite um numero até 20: ");
      num = int.Parse(Console.ReadLine());

      if (num > 20 && num < 0)
      {
        Console.WriteLine("Numero inválido!");
      }
      
        for (int i = 0; i <= num; i++)
        {
          if (i %2 == 0)
          {
            par = par + 1;
            somaPar += i;
          } else {
              impar = impar + 1;
              somaImpar += i;
          }
        }
        Console.WriteLine("O total de numeros pares até chegar em " + num + " é " + par + " e o total de numeros impares é " + impar);
      Console.WriteLine("O valor total de numeros pares até chegar em " + num + " é " + somaPar + " e o valor total de numeros impares é " + somaImpar);
    }
  }
}
