package hugobor.desafioumliphone.sketch;

public class ITunes extends ReprodutorMusica {
	
	private Object conta = null;
	
	public Object getConta() {
		return conta;
	}

	public void setConta(Object conta) {
		this.conta = conta;
	}

	
	@Override
	void toca() {
		System.out.println("Método toca");
	}

	@Override
	void toca(Musica umaMusica) {
		System.out.println("Método toca");
	}

	@Override
	void para() {
		System.out.println("Método para");
	}

	@Override
	void pausaMusica() {
		System.out.println("Método pausa");
	}

	@Override
	void proxima() {
		System.out.println("Método proxima");
	}

	@Override
	void anterior() {
		System.out.println("Método anterior");
	}

	@Override
	void selecionaMusica(Musica umaMusica) {
		System.out.println("Método selecionaMusica");
	}

	@Override
	void adicionaNaFila(Musica umaMusica) {
		System.out.println("Método adicionaNaFila");

	}

	@Override
	void removeDaFila(int posicao) {
		System.out.println("Método removeDaFila");
	}
	
	
	
	public void compra(Musica umaMusica) {
		System.out.println("Método compra");
	}
	
	public void stream(Musica umaMusica) {
		System.out.println("Método stream");
	}
	
	public void baixa(Musica umaMusica) {
		System.out.println("Método baixa");
	}
	
	public void deleta(Musica umaMusica) {
		System.out.println("Método deleta");
	}
	
	public void login() {
		System.out.println("Método login");
	}
	
	public void logout() {
		System.out.println("Método logout");
	}
	
	public void signin() {
		System.out.println("Método signin");
	}

}
