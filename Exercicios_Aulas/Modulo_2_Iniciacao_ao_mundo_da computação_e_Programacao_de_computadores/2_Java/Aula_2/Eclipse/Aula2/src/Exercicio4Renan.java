import java.util.Scanner;

public class Exercicio4Renan {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    float n1, n2, n3, medIndv, medGeral, maiorMed, menorMed;
	    int c;
	    medIndv = 0;
	    medGeral = 0;
	    maiorMed=0;
	    menorMed=10;
	    String name;
	    Scanner imput = new Scanner(System.in);
	            for (c=1;c<=5;c++) {
	                n1 = 0;
	                n2 = 0; 
	                n3 = 0;
	                System.out.println("Informe o nome do aluno:");
	                name = imput.next();
	                System.out.println("Informe a primeira nota:");
	                n1 = imput.nextFloat();
	                System.out.println("Informe a segunda nota:");
	                n2 = imput.nextFloat();
	                medIndv = (n1+n2) / 2;
	                    if (medIndv >= 6.0) {
	                        System.out.println("A média individual do aluno "+ name +" "+ medIndv+ " Aluno aprovado!");
	                    }
	                    else {
	                        System.out.println("A média individual do aluno "+ name +" "+ medIndv+ " Aluno reprovado!");
	                    }
	                    while (medIndv > maiorMed) {maiorMed = medIndv;}
	                    while (medIndv < menorMed) {menorMed = medIndv;}

	                n3 = n1+n2;
	                medGeral=n3+medGeral;

	        }
	        imput.close();
	        System.out.println("A média geral da turma é igual a: "+ medGeral/5);
	        System.out.println("A maior média na turma foi:"+ maiorMed);
	        System.out.println("A menor média na turma foi:"+ menorMed);

	    }
	
}
