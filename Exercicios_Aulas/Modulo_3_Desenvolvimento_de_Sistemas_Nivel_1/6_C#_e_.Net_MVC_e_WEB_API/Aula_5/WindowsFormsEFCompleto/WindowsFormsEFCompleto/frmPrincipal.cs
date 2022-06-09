using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsEFCompleto
{
    public partial class frmPrincipal : Form
    {
        public int valIdentificacao = 0;

        public frmPrincipal()
        {
            InitializeComponent();
        }

        private void txtId_Leave(object sender, EventArgs e)
        {
            if (txtId.Text != "")
            {
                var id = Convert.ToInt32(txtId.Text);
                BuscarAluno(id);
            }
        }

        private void BuscarAluno(int id)
        {
                try
                {
                /*
                 var aluno = new ClassAluno().GetAluno(id);
                ou
                 */
                var aluno = new ClassAluno(); //instância o objeto aluno da Classe Aluno
                    aluno = aluno.GetAluno(id); // chama o método e atribui informaçãoes para aluno

                if (aluno != null)
                {
                    txtId.Text = aluno.id_alu.ToString(); //passa dados do objeto aluno para o formulário
                    txtNome.Text = aluno.nome;
                    txtEndereco.Text = aluno.endereco;
                    txtBairro.Text = aluno.bairro;
                    txtCidade.Text = aluno.cidade;
                    txtUf.Text = aluno.uf;
                    valIdentificacao = 0;
                    BotaoDesinibir(1);
                }
                else
                {
                    MessageBox.Show("Aluno não encontrado, pode proceder com a inclusão");
                    valIdentificacao = 1;
                    BotaoDesinibir(0); // chama método para liberar o acesso aos botões
                }
                    
            }
            catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            using(frmBuscar busca = new frmBuscar())
            {
                busca.ShowDialog();
            }
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close(); // fecha o formulário
        }

        private void button1_Click(object sender, EventArgs e)
        {
            LimparForm(); // chama método para limpar o formulário
            BotaoInibir();
        }

        private void btnIncluir_Click(object sender, EventArgs e)
        {
            if (validaForm());
            {
                Salvar(valIdentificacao);
                LimparForm(); // chama método para limpar o formulário
                BotaoInibir(); // chama método para inibir botões
            }
        }

        private void BotaoInibir()
        {
            btnIncluir.Enabled = false;
            btnAlterar.Enabled = false;
            btnExcluir.Enabled = false;
        }

        private void BotaoDesinibir(int infoBtn)
        {
            if (infoBtn == 0)
                btnIncluir.Enabled = true;
            else
            {
                btnAlterar.Enabled = true;
                btnExcluir.Enabled = true;
            }
        }

        private void LimparForm()
        {
            txtId.Clear();
            txtNome.Clear();
            txtEndereco.Clear();
            txtBairro.Clear();
            txtCidade.Clear();
            txtUf.Clear();
            txtId.Focus();
        }

        private bool validaForm()
        {
            if (txtId.Text == "")
            {
                MessageBox.Show("Id não Preenchido");
                txtId.Focus();
                return false;
            }
            else if (txtNome.Text == "")
            {
                MessageBox.Show("Nome não Preenchido");
                txtNome.Focus();
                return false;
            }
            else if (txtBairro.Text == "")
            {
                MessageBox.Show("Bairro não Preenchido");
                txtBairro.Focus();
                return false;
            }
            else if (txtCidade.Text == "")
            {
                MessageBox.Show("Cidade não Preenchido");
                txtCidade.Focus();
                return false;
            }
            else if (txtUf.Text == "")
            {
                MessageBox.Show("Uf não Preenchido");
                txtUf.Focus();
                return false;
            }
            else
                return true;
        }

        private bool Salvar(int valIdentificacao)
        {
            var aluno = new ClassAluno();
            aluno.id_alu = Convert.ToInt32(txtId.Text);
            aluno.nome = txtNome.Text;
            aluno.endereco = txtEndereco.Text;
            aluno.cidade = txtCidade.Text;
            aluno.bairro = txtBairro.Text;
            aluno.uf = txtUf.Text;

            try
            {
                aluno.Salvar(aluno, valIdentificacao);
                if (valIdentificacao != 0)
                    MessageBox.Show("Aluno incluído com sucesso");
                else
                    MessageBox.Show("Aluno alterado com sucesso");
                return true;
            }
            catch (Exception ex)
            {
                MessageBox.Show("Falha: " + ex.Message);
                return false;
            }
        }

        private void btnAlterar_Click(object sender, EventArgs e)
        {
            if (validaForm());
            {
                Salvar(valIdentificacao); // chama método para salvar as informações do formulário
                LimparForm(); // chama método para limpar o formulário
                BotaoInibir(); // chama método para inibir botões
            }
        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if (txtId.Text == "")
            {
                MessageBox.Show("Não há aluno informado");
                txtId.Focus();
            }
            else
            {
                var aluno = new ClassAluno(); // instância o objeto ClassAluno
                aluno.id_alu = Convert.ToInt32(txtId.Text);
                aluno.Excluir(aluno);
            }
        }
    }
}

