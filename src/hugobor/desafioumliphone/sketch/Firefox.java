package hugobor.desafioumliphone.sketch;

public class Firefox extends Navegador {

	public Firefox() {
		super();

	}

	@Override
	void novaAba() {
		System.out.println("Método novaAba");
	}

	@Override
	void fechaAbaAtual() {
		System.out.println("Método fechaAbaAtual");
	}

	@Override
	void fechaAba(int posicao) {
		System.out.println("Método fechaAba");

	}

	@Override
	void adicionaFavorito(String link) {
		System.out.println("Método adicionaFavorito");
	}

	@Override
	void removeFavorito(String link) {
		System.out.println("Método removeFavorito");
	}

}
