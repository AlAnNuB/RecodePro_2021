
public class Lampada {
	boolean ligada;
	String cor;
	
	void lampadaLigada() {
		ligada = true;
	}
	
	void lampadaDesligada() {
		ligada = false;
	}
	
	void status() {
		if(ligada == true) {
			System.out.println("A lampada está Ligada!\nE a cor é: " + cor);
		}else {
			System.out.println("A lampada está Desligada!");
		}
	}
}
