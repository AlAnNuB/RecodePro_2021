using System;

namespace Exercicio02
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Fazer um programa para que o usuário possa digitar duas notas, na sequência o programa deverá calcular a média (media =  (nota1 + nota2)/2). É preciso fazer uso da estrutura ternária para exibir na tela se o aluno está ou não aprovado. */

            double nota1, nota2, media;
            string resultado = "Você foi ";
        
            Console.WriteLine("Digite a primeira nota:");
                nota1 = double.Parse(Console.ReadLine());
            Console.WriteLine("Digite a segunda nota:");
                nota2 = double.Parse(Console.ReadLine());

            media = (nota1 + nota2) / 2;

            resultado += media >= 7 ? "Aprovado!" : "Reprovado!";

            Console.WriteLine(resultado + " Com a nota: " + media);
        }
    }
}
