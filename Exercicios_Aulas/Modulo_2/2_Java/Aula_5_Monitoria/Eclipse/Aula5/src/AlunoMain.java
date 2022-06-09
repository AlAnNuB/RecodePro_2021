import java.util.Scanner;

public class AlunoMain {

	public static void main(String[] args) {
		// Escreva uma class para representar um aluno,
		// adicione atributos relacionados as caracteristicas
		// de um aluno como nome matricula curso que esta
		// matriculado nome de 3 disciplinas que esta cursando e
		// as notas dessas 3 disciplinas. Desenvolva um metodo
		// pra verificar se o aluno esta aprovado
		// (nota maior ou igual a 7) em uma determinada
		// disciplina. Escreva um programa para testar essa
		// classe, que pede as informaçoes do aluno ao usuario
		// e ao final informar o nome das disciplinas, mostra as
		// notas e mostra se o aluno foi aprovado ou nao

		Aluno a1 = new Aluno();

		System.out.println("Digite o seu nome: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		a1.setNome(nome);
		a1.setCurso("recode");
		a1.setMatricula(213);
		System.out.println();
		System.out.println(a1.getNome());
		System.out.println(a1.getCurso());
		System.out.println(a1.getMatricula());
		a1.addNotasEDisciplina(sc);
		a1.resultado();
	}
}