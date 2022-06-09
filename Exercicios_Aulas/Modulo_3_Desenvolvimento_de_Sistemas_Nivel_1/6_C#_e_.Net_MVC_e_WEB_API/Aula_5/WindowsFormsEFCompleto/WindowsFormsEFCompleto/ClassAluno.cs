using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsEFCompleto
{
    public class ClassAluno : aluno
    {
        public ClassAluno GetAluno(int id)
        {
            // dbContext é um Entity Framework
            using (var dbContext = new recodeEntities())
            {
                var entalu = dbContext.aluno.Find(id); // Find irá localizar o Id na base de dados

                if (entalu != null)
                {
                    var aluno = new ClassAluno();
                    aluno.id_alu = entalu.id_alu;
                    aluno.nome = entalu.nome;
                    aluno.endereco = entalu.endereco;
                    aluno.bairro = entalu.bairro;
                    aluno.cidade = entalu.cidade;
                    aluno.uf = entalu.uf;
                    return aluno;
                }
                else
                    return null;
            }
        }

        public static List<ClassAluno> GetAlunos(String nome)
        {
            // dbContext é um Entity Framework
            using (var dbContext = new recodeEntities())
            {
                var entListaAluno = dbContext.aluno.Where(v => v.nome.Contains(nome)); // lista de alunos encontrados

                if (entListaAluno != null)
                {
                    var listaAlunos = new List<ClassAluno>();
                    foreach(var item in entListaAluno)
                    {
                        listaAlunos.Add(new ClassAluno{ id_alu = item.id_alu, nome = item.nome,
                        endereco = item.endereco, bairro = item.bairro, cidade = item.cidade,
                        uf = item.uf});
                    }
                    return listaAlunos;
                }
                else
                    return null;
            }
        }

        public void Salvar(ClassAluno aluno, int valIdentificacao)
        {
            using (var dbContext = new recodeEntities())
            {
                var entaluno = new aluno();
                entaluno.id_alu = aluno.id_alu;
                entaluno.nome = aluno.nome;
                entaluno.endereco = aluno.endereco;
                entaluno.bairro = aluno.bairro;
                entaluno.cidade = aluno.cidade;
                entaluno.uf = aluno.uf;

                if (valIdentificacao != 0)
                    dbContext.aluno.Add(entaluno); // aqui faz a inclusão de um novo aluno (INSERT)
                else
                    dbContext.Entry(entaluno).State = System.Data.Entity.EntityState.Modified; // aqui faz a alteralçao de informações (UPDATE)

                dbContext.SaveChanges(); // método que salva as informações
            }
        }

        public void Excluir(ClassAluno aluno)
        {
            using (var dbContext = new recodeEntities())
            {
                var entaluno = new aluno();
                entaluno.id_alu = aluno.id_alu;

                dbContext.aluno.Attach(entaluno); // anexa banco de dados
                dbContext.aluno.Remove(entaluno); // aqui remove a informações (DELETE)
                dbContext.SaveChanges(); // método que salva as informações
            }
        }
    }
}
