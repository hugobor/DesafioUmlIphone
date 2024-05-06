package hugobor.desafioumliphone.sketch;

import java.util.ArrayList;
import java.util.List;

public abstract class Aba {
	
	private Navegador navegador = null;
	
	private List<String> historico = new ArrayList<>();
	private Object sessao = null;
	private Object requisicao = null;
	public Navegador getNavegador() {
		return navegador;
	}
	public void setNavegador(Navegador navegador) {
		this.navegador = navegador;
	}
	public List<String> getHistorico() {
		return historico;
	}
	public void setHistorico(List<String> historico) {
		this.historico = historico;
	}
	public Object getSessao() {
		return sessao;
	}
	public void setSessao(Object sessao) {
		this.sessao = sessao;
	}
	public Object getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(Object requisicao) {
		this.requisicao = requisicao;
	}
	
	
	abstract void abrePagina(String url);
	abstract void recarrega();
	
	abstract void fecha();
	
	abstract void anterior();
	abstract void proxima();
	
	abstract void paraHistorico(int posicao);
	
	abstract void abreEmNovaAba(String url);
	abstract void adicionaFavorito(String url);	
}
