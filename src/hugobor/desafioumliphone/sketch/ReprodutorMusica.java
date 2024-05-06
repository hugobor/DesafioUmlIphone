package hugobor.desafioumliphone.sketch;

import java.util.ArrayList;
import java.util.List;

public abstract class ReprodutorMusica extends App {
	
	private Musica musicaAtual = null;
	private List<Musica> filaMusicas = new ArrayList<>();
	
	public Musica getMusicaAtual() {
		return musicaAtual;
	}
	public void setMusicaAtual(Musica musicaAtual) {
		this.musicaAtual = musicaAtual;
	}
	public List<Musica> getFilaMusicas() {
		return filaMusicas;
	}
	public void setFilaMusicas(List<Musica> filaMusicas) {
		this.filaMusicas = filaMusicas;
	}
	
	abstract void toca();
	abstract void toca(Musica umaMusica);

	abstract void para();
	abstract void pausaMusica();
	abstract void proxima();
	abstract void anterior();
	
	abstract void selecionaMusica(Musica umaMusica);
	abstract void adicionaNaFila(Musica umaMusica);
	abstract void removeDaFila(int posicao);
	
}
