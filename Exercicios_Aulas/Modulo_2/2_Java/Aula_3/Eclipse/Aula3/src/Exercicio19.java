import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		// 19. Ler as duas notas bimestrais para um conjunto de 10 alunos.
		// Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
		// tipo real. Escreva um programa que calcule a média aritmética simples
		// das notas informadas armazenando o resultado em um vetor “Result”
		// de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação	
		// de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
		// estará “aprovado”, caso contrário, a situação do aluno será
		// “reprovado”.
		Scanner S = new Scanner(System.in);
		
		float[] nota1 = new float[3];
		float[] nota2 = new float[nota1.length];
		float[] result = new float[nota1.length];
		String[] nomes = new String[nota1.length];
		String[] nome = new String[nota1.length];
		int i;
	
		for(i = 0; i < nota1.length; i++) {
			System.out.print("Digite o nome do " + i + " aluno: ");
			nome[i] = S.next();
			System.out.print("Digite a 1° nota: ");
			nota1[i] = S.nextFloat();
			System.out.print("Digite a 2° nota: ");
			nota2[i] = S.nextFloat();
			System.out.println();
			if(i < nota1.length) {
				result[i] = (nota1[i] + nota2[i]) / 2;
				nomes[i] = nome[i];
			}
			
		}
		
		for(i = 0; i < nota1.length; i++) {
			if(result[i] >= 7) {
				System.out.println("O aluno " + nomes[i] + " ficou com a media: " + result[i] + " e está APROVADO");
			}
			if(result[i] < 7){
				System.out.println("O aluno " + nomes[i] + " ficou com a media: " + result[i] + " e está REPROVADO");
			}
		}
	
		
		S.close();
	}

}
