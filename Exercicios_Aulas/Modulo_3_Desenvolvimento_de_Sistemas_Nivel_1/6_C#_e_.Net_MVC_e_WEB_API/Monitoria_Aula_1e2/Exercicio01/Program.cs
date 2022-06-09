using System;

namespace Exercicio01
{
  class Program
  {
    public static void Main(string[] args)
    {
      /*4-fazer um programa para que o usuário informe um número até 20 e o programa exiba
      na tela quantos desses números são pares e ímpares. No final somar o total de
      números pares com os números ímpares.
      Lembrando que o valor da variável de controle deve começar com zero, e o zero não
      deve ser computado. Computar apenas a partir do número 1.
      */

      bool valido = false;
      int contadorPar = 0;
      int contadorImpar = 0;
      int soma = 0;

      do
      {
        try
        {
          Console.WriteLine("Digite um numero de 1 a 20");
          int num = Convert.ToInt32(Console.ReadLine());
          if (num > 20 || num <= 0)
          {
            Console.WriteLine("Digite apenas numeros entre 1 e 20");
          }
          else
          {
            valido = true;

            for (int i = 0; i <= num; i++)
            {
              if (i % 2 == 0 && i != 0)
              {
                contadorPar++;
              }
              else if (i % 2 == 1)
              {
                contadorImpar++;
              }

              soma += i;
            }

            Console.WriteLine("Total numeros pares: {0}", contadorPar);
            Console.WriteLine("Total numeros impares: {0}", contadorImpar);
            Console.WriteLine("A soma dos numeros pares e impares foram de {0}", soma);

          }
        }
        catch (Exception ex)
        {
          Console.WriteLine("Informe apenas numeros inteiros.");
          Console.WriteLine("ERRO: " + ex.Message);
        }
      } while (!valido);
    }
  }
}
