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
    public partial class frmBuscar : Form
    {
        public frmBuscar()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BuscarAlunos(txtNome.Text);
        }

        private void BuscarAlunos(String nome)
        {
            dataGridView1.DataSource = ClassAluno.GetAlunos(nome);
        }
    }
}
