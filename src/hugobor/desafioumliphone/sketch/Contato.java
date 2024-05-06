package hugobor.desafioumliphone.sketch;

public class Contato {
	
	private String nome = "";
	private String email = "";
	private String numero = "";
	private Object endereco = null;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Object getEndereco() {
		return endereco;
	}
	public void setEndereco(Object endereco) {
		this.endereco = endereco;
	}
	
	public Contato() {
		super();
		
	}
	
	
	public void liga() {
		System.out.println("Método liga");
	}
	
	public void edita() {
		System.out.println("Método edita");
	}

}
