import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
			Scanner x = new Scanner(System.in);
			System.out.println("Digite seu peso:");
			float peso = x.nextFloat();
			System.out.println("Digite sua altura:");
			float altura = x.nextFloat();
			float imc = (peso/(altura*altura));
			x.close();
			
			if(imc <= 18.5) {
				System.out.println("Sua classificação é Magreza");
			}else if (imc >= 18.5 && imc <= 24.9) {
				System.out.println("Sua classificação é Normal");
			}else if (imc >= 25.0 && imc <= 29.9) {
				System.out.println("Sua classificação é Obesidade I");
			}else if (imc >= 30.0 && imc <= 39.9) {
				System.out.println("Sua classificação é Obesidade II");
			}else if (imc >= 40) {
				System.out.println("Sua classificação é Obesidade Morbida");
			}
			
		}
	
	}

