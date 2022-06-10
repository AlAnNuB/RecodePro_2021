using System;

namespace Exercicio03
{
  class Program
  {
    static void Main(string[] args)
    {
      /* fazer um programa para que o usuário possa digitar uma opção (+, -, *, /), dessa forma o switch case deverá entrar na opção escolhida e realizar a operação aritmética. */
      double num1, num2, result;
      string operacao;

      Console.WriteLine("Digite o 1 numero:");
      num1 = double.Parse(Console.ReadLine());
      Console.WriteLine("Digite o 2 numero:");
      num2 = double.Parse(Console.ReadLine());

      Console.WriteLine("Selecione uma operação:");
      Console.WriteLine("( + ) para somar");
      Console.WriteLine("( - ) para subtrair");
      Console.WriteLine("( * ) para multiplicar");
      Console.WriteLine("( / ) para dividir");
      operacao = Console.ReadLine();

      switch (operacao)
      {
        case "+":
          result = num1 + num2;
          Console.WriteLine("O valor da soma é: " + result);
          break;
        case "-":
          result = num1 - num2;
          Console.WriteLine("O valor da subtração é: " + result);
          break;
        case "*":
          result = num1 * num2;
          Console.WriteLine("O valor da multiplicação é: " + result);
          break;
        case "/":
          result = num1 / num2;
          Console.WriteLine("O valor da divisão é: " + result);
          break;
        default: 
            Console.WriteLine("O valor digitado é inválido");
            break;
      }
    }
  }
}
