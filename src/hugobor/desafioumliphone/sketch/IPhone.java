package hugobor.desafioumliphone.sketch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IPhone {
	
	private App appFrente = null;
	private String numeroSim = "";
	
	private Set<App> instaladas = new HashSet<>();
	
	private List<App> emExecucao = new ArrayList<>();
	
	
	public App getAppFrente() {
		return appFrente;
	}

	public void setAppFrente(App appFrente) {
		this.appFrente = appFrente;
	}

	public String getNumeroSim() {
		return numeroSim;
	}

	public void setNumeroSim(String numeroSim) {
		this.numeroSim = numeroSim;
	}

	public Set<App> getInstaladas() {
		return instaladas;
	}

	public void setInstaladas(Set<App> instaladas) {
		this.instaladas = instaladas;
	}

	public List<App> getEmExecucao() {
		return emExecucao;
	}

	public void setEmExecucao(List<App> emExecucao) {
		this.emExecucao = emExecucao;
	}


	public IPhone() {
		super();
		
		instaladas.add(new ITunes());
		instaladas.add(new SPotify());
		instaladas.add(new Firefox());
		instaladas.add(new Safari());
		instaladas.add(new Chrome());
		instaladas.add(new Telefone());
	}





	public void liga() {
		System.out.println("Método liga");
	}
	
	public void desliga() {
		System.out.println("Método desliga");
	}
	
	public void atualiza() {
		System.out.println("Método atualiza");
	}

	
	public void lancaApp(App anApp) {
		System.out.println("Método lancaApp");
	}
	
	public void fechaApp(App anApp) {
		System.out.println("Método fechaApp");
	}
	
	public void minimizaApp() {
		System.out.println("Método minimizaApp");
	}
	
	public void trocaAppFrente(App anApp) {
		System.out.println("Método trocaAppFrente");
	}
	
	
	public void instalaApp(String appId) {
		System.out.println("Método instalaApp");
	}
	
	public void desinstalaApp(App anApp) {
		System.out.println("Método desinstalaApp");
	}
}
