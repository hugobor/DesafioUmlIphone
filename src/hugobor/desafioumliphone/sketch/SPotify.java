package hugobor.desafioumliphone.sketch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SPotify extends ReprodutorMusica {

	private Object conta = null;
	
	private List<Musica> favoritos = new ArrayList<>();
	private Map<String, List<Musica>> playlists = new HashMap<>();
	
	
	public Object getConta() {
		return conta;
	}

	public void setConta(Object conta) {
		this.conta = conta;
	}

	public List<Musica> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Musica> favoritos) {
		this.favoritos = favoritos;
	}

	public Map<String, List<Musica>> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(Map<String, List<Musica>> playlists) {
		this.playlists = playlists;
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

	
	public void stream(Musica umaMusica) {
		System.out.println("Método stream");
	}
	
	public void favorita(Musica umaMusica) {
		System.out.println("Método favorita");
	}
	
	public void desFavorita(Musica umaMusica) {
		System.out.println("Método desFavorita");
	}
	
	public void novaPlaylist(String nome) {
		System.out.println("Método novaPlaylist");
	}
	
	public void removePlaylist(String nome) {
		System.out.println("Método removePlaylist");
	}
	
	public void adicionaAPlaylist(Musica umaMusica, String nomePlaylist) {
		System.out.println("Método adicionaAPlaylist");
	}
	
	public void removeDaPlaylist(Musica umaMusica, String nomePlaylist) {
		System.out.println("Método removeDaPlaylist");
	}
	
	

}
