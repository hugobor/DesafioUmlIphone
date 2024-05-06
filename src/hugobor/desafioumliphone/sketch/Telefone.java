package hugobor.desafioumliphone.sketch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Telefone extends App {
	
	private List<Contato> historicoChamadas = new ArrayList<>();
	private List<Contato> historicoLigacoes = new ArrayList<>();
	private String provedor = "";
	
	private Contato meuContato = new Contato();
	private Set<Contato> agenda = new HashSet<>();
	
	public List<Contato> getHistoricoChamadas() {
		return historicoChamadas;
	}

	public void setHistoricoChamadas(List<Contato> historicoChamadas) {
		this.historicoChamadas = historicoChamadas;
	}

	public List<Contato> getHistoricoLigacoes() {
		return historicoLigacoes;
	}

	public void setHistoricoLigacoes(List<Contato> historicoLigacoes) {
		this.historicoLigacoes = historicoLigacoes;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}
	
	public Contato getMeuContato() {
		return meuContato;
	}

	public void setMeuContato(Contato meuContato) {
		this.meuContato = meuContato;
	}

	public Set<Contato> getAgenda() {
		return agenda;
	}

	public void setAgenda(Set<Contato> agenda) {
		this.agenda = agenda;
	}

	public Telefone() {
		super();
		
	}
	
	
	
	public void liga(String numero) {
		System.out.println("Método liga");
	}
	
	public void liga(Contato umContanto) {
		System.out.println("Método liga");
	}
	
	public void atende() {
		System.out.println("Método atende");
	}
	
	public void iniciaCorreioDeVoz() {
		System.out.println("Inicia Correio de Voz");
	}
	
	public void adicionaContato(Contato umContato) {
		System.out.println("Método adicionaContato");
	}
	
	public void removeContato(Contato umContato) {
		System.out.println("Método removeContato");
	}
}
