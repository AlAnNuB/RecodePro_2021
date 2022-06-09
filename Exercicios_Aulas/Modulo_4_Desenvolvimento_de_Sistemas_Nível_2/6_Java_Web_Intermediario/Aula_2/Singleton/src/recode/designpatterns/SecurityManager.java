package recode.designpatterns;

public class SecurityManager {
	// atribui um atributo como estático - 
	// compartilhado com todas as instâncias
	private static SecurityManager instance;
	
	// private - apenas a propria classe tem acesso
	private SecurityManager() {
		
	}
	//Criar um método pata interagir com o instance
	public static SecurityManager getInstance() {
		if (instance == null) {
			instance = new SecurityManager();
		}
		return instance;
	}
	
	public void login() {
		
	}
}
