
public class Exercicio1Aluno {
	private int matricula;
	private String nome;
	private String disciplina;
	private double nota1;
	private double nota2;
	private double notaT;
	private double media;
	
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaT() {
		return notaT;
	}
	public void setNotaT(double notaT) {
		this.notaT = notaT;
	}
	
	
	public void media (double nota1 , double nota2, double notaT) {
		this.setNota1(nota1 *= 2.5);
		this.setNota2(nota2 *= 2.5);
		this.setNotaT(notaT *= 2);
		this.media = (this.nota1 + this.nota2 + this.notaT) / 7;
		
				
	}
	
	public void notaFinal () {
		System.out.println("==========================");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Matricula: "+this.getMatricula());
		System.out.println("Discipina: "+this.getDisciplina());
		System.out.println();
		System.out.print("A média do aluno foi ");
		System.out.printf("%.2f",this.getMedia());
		System.out.print(".");
		System.out.println();

		if ((media > 5) && (media < 7)) {
			double falta = 7 -this.media;
			System.out.print("Faltam ");
			System.out.printf("%.2f",falta);
			System.out.print(" pontos pra você passar.");

		}else if (this.getMedia() > 7) {
			System.out.println("O aluno passou direto.");
		}else {
			System.out.println("O aluno não passou para a prova final");
		}
	}
	
}
	
