
public class Exercicio1Main {

	public static void main(String[] args) {
		/*
		 * Questão 1
		 * Escreva uma classe cujos objetos representam alunos matriculados em
		 * uma disciplina. Cada objeto dessa classe deve guardar os seguintes dados do
		 * aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
		 * seguintes métodos para esta classe: media calcula a média final do aluno
		 * (cada prova tem peso 2,5 e o trabalho tem peso 2) final calcula quanto o
		 * aluno precisa para a prova final (retorna zero se ele não for para a final)
		 */
		
		Exercicio1Aluno aluno = new Exercicio1Aluno();
		
		
		aluno.setDisciplina("Matematica");
		aluno.setMatricula(123456);
		aluno.setNome("Alan");
		aluno.media(3, 8, 3);
		aluno.notaFinal();

	}

}
