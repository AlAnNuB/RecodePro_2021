
public class Lampada {
	private boolean ligado;
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getLigado() {
		return ligado;
	}
	
	public void status() {
		if (this.getLigado() == true) {
			System.out.println("A lampada está Ligada! ");
		}else {
			System.out.println("A lampada está Desligada! ");
		}
	}
}
