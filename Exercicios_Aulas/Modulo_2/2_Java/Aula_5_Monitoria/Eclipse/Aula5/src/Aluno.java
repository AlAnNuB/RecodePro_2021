import java.util.Scanner;

public class Aluno {

	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[] notas = new double[3];

	public void addNotasEDisciplina(Scanner sc) {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina: ");
			sc.nextLine();
			this.disciplinas[i] = sc.nextLine();
			System.out.println("Digite a nota do aluno");
			this.notas[i] = sc.nextDouble();
		}
		sc.close();
	}

	public void resultado() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Disciplina: " + this.disciplinas[i]);
			if (this.notas[i] >= 7) {
				System.out.println("Aprovado, Nota: " + this.notas[i]);
			} else {
				System.out.println("Reprovado, Nota: " + this.notas[i]);
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}