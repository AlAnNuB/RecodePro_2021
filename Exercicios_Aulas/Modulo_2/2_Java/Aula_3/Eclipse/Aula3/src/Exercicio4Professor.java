import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4Professor {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

 int[] vetorA = new int[3];
double[] vetorB = new double[vetorA.length];

 for (int i = 0; i < vetorA.length; i++) {
System.out.println("Entre com o valor da posição: " + i);

 vetorA[i] = scan.nextInt();

 vetorB[i] = Math.sqrt(vetorA[i]);
}
System.out.println("Vetor A: ");
for (int i = 0; i < vetorA.length; i++) {
System.out.print(vetorA[i] + " ");
}
System.out.println();
DecimalFormat df = new DecimalFormat("###,###.###");

System.out.println("Vetor B: ");
for (int i = 0; i < vetorB.length; i++) {
System.out.print(df.format(vetorB[i]) + " ");
}
System.out.println();

scan.close();

 }

}