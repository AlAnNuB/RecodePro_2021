
public class DadosPessoais {
	public String nome;
	private String email;
	private int telefone;
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}

	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int t) {
		this.telefone = t;
	}
	
	public void status() {
		System.out.println("---------------- Dados Pessoais ------------------");
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu telefone é: " + telefone);
		System.out.println("Seu emaail é: " + email);
		System.out.println("--------------------- DP -----------------------");
	}
	
}
