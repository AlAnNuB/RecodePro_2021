using System;

namespace Exercicio02
{
  class Program
  {
    static void Main(string[] args)
    {
      /* 
           Crie um programa que simule um posto de combustivel. Você deverá ler o tipo de combustivel, e a quantidade de litros que deseja abastecer, e no final mostre o tipo de combustivel digitado e o valor final.alcool = 3,5 por litro gasolina = 4,0 por litro
      */


      String continuar;
      do
      {
        String tipoCombustivel;
        double quantidadeLitros = 0;
        double precoCombustivel = 0;
        do
        {
          Console.Write("Digite o tipo do combustivel [A] ou [G]: ");
          tipoCombustivel = Console.ReadLine();
        } while (tipoCombustivel != "G" && tipoCombustivel != "A");
        if (tipoCombustivel.Equals("A"))
        {
          precoCombustivel = 3.5;
        }
        else if (tipoCombustivel.Equals("G"))
        {
          precoCombustivel = 4;
        }
        bool litrosValido = false;
        do
        {
          try
          {
            Console.Write("Digite quantos litros deseja: ");
            quantidadeLitros = Convert.ToDouble(Console.ReadLine().Replace(".", ","));
            litrosValido = true;
          }
          catch (Exception ex)
          {
            Console.WriteLine("Na proxima vez digita um número");
          }
        } while (!litrosValido);

        double precoFinal = precoCombustivel * quantidadeLitros;
        Console.WriteLine("O tipo do combustivel escolhido foi {0} e o preço final é de ${1} reais ", tipoCombustivel, precoFinal);
        Console.WriteLine("Deseja abastecer novamente? [S] ou [N]");
        continuar = Console.ReadLine();
        Console.ReadKey();
      } while (continuar.Equals("S"));
    }
  }

}
