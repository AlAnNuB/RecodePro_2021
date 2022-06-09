using System;
using System.Collections;

namespace Explicacao
{
  class Program
  {
    static void Main(string[] args)
    {
      var arList = new ArrayList()
        {
        127,
        "Jorge",
        520,
        4.5f,
        760
        };

      Console.WriteLine(arList.Contains(520)); // true
      Console.WriteLine(arList.Contains("Jorge")); // true
      Console.WriteLine(arList.Contains(10)); // false

      if (arList.Contains("Jorge") == false)
        Console.WriteLine("Informação não encontrada");
      else
        Console.WriteLine("Informação encontrada");
    }
  }
}
