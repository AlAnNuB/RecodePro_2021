
public class VetorArray {

	public static void main(String[] args) {
		double TempD1 = 31.3;
		double TempD2 = 31.3;
		double TempD3 = 31.3;
		double TempD4 = 31.3;
		double TempD5 = 31.3;

		double[] temperaturas = new double[30];
		temperaturas[0] = 31.3;
		temperaturas[1] = 35.3;
		temperaturas[2] = 30;
		temperaturas[3] = 33;
		temperaturas[4] = 29.6;

		System.out.println("A temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("Meu Array tem o tamanho de: " + temperaturas.length);
		System.out.println("Os Valores do Array são: " + temperaturas);

			for(int i=0; i<temperaturas.length; i++){
				System.out.println("O Valor da temperatura do dia " + (i+1) + " foi de: " + temperaturas[i]);
			}
			for(double temp : temperaturas) {
				System.out.println(temp);
			}

	}

}
