import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
	//	Para receber o nome de um aluno com suas respectivas notas (2), em seguida calcular a média 
	//	do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
	//	(aprovado com média >= 6).
	//	(*) Utilizar o código para uma turma de 5 alunos.
	//	(*) Calcular e mostrar a média geral da turma
	//	(*) Mostrar a maior média da turma
	//	(*) Mostrar a menor média da turma

		float n1,n2,n3, maiM, menM, mg;
		String nome, nom, nom2;
		
		mg = 0;
		maiM = 0;
		menM = 10;
		nom = "";
		nom2 = "";
				
		Scanner x = new Scanner(System.in);		
		for(int i = 1; i <= 5; i++) {
			n3 = 0;
			n2 = 0;
			n1 = 0;
			System.out.println("Digite o nome do "+ i +" aluno:");
			nome = x.next();
			System.out.println("Digite a 1 nota:");
				n1 = x.nextFloat();
			System.out.println("Digite a 2 nota:");
				n2 = x.nextFloat();
				
				n3 = (n1+n2)/2;
				if(n3 >= 6) {
					System.out.println("A media do " + nome + " é: " + n3);
					System.out.println("Parabéns Você foi APROVADO!");
				}else if(n3 <= 5){
					System.out.println("A media do " + nome + " é: " + n3);
					System.out.println("Você foi REPROVADO. Mais não desista, tente novamente.");
				}
				while(n3 > maiM) {
					maiM = n3;
					nom = nome;
				}
				while(n3 < menM) {
					menM = n3;
					nom2 = nome;
				}
				mg = (mg + n3);
		}
		x.close();
		
        System.out.println("A média geral da turma é igual a: " + mg/5);
        System.out.println("A maior média na turma foi:" + maiM + " do " + nom);
        System.out.println("A menor média na turma foi:" + menM + " do " + nom2);
	}

}
