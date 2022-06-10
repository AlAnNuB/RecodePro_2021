using System.ComponentModel.DataAnnotations;

namespace MonitoriaCrud.Models
{
    public class Pessoa
    {
        [Key]
         public int ID { get; set; }
         public string Nome { get; set; }
         public string Email { get; set; }
         public string Endereco { get; set; }
         public string Bairro { get; set; }
         public string Cidade { get; set; }
         public string UF { get; set; }
         public string CPF { get; set; }
         public DateTime Nascimento { get; set; }
    }
}