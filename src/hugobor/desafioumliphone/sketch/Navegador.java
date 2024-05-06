package hugobor.desafioumliphone.sketch;

import java.util.ArrayList;
import java.util.List;

public abstract class Navegador extends App {
	
	private Object cache = null;
	
	private List<String> favoritos = new ArrayList<>();
	private List<String> historicoGeral = new ArrayList<>();
	
	private Aba abaAtual;
	private List<Aba> abasAbertas = new ArrayList<>();

	
	public Object getCache() {
		return cache;
	}
	
	public void setCache(Object cache) {
		this.cache = cache;
	}
	
	public List<String> getFavoritos() {
		return favoritos;
	}
	
	public void setFavoritos(List<String> favoritos) {
		this.favoritos = favoritos;
	}
	
	public List<String> getHistoricoGeral() {
		return historicoGeral;
	}
	
	public void setHistoricoGeral(List<String> historicoGeral) {
		this.historicoGeral = historicoGeral;
	}

	public Aba getAbaAtual() {
		return abaAtual;
	}

	public void setAbaAtual(Aba abaAtual) {
		this.abaAtual = abaAtual;
	}

	public List<Aba> getAbasAbertas() {
		return abasAbertas;
	}

	public void setAbasAbertas(List<Aba> abasAbertas) {
		this.abasAbertas = abasAbertas;
	}
	
	abstract void novaAba();
	
	abstract void fechaAbaAtual();
	abstract void fechaAba(int posicao);
	
	abstract void adicionaFavorito(String link);	
	abstract void removeFavorito(String link);

}
