package hugobor.desafioumliphone.sketch;

public abstract class App {
	
	private String appId = "";
	private String nome = "";
	private Object icone = null;
	private String local = "";
	
	public String getAppId() {
		return appId;
	}
	
	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Object getIcone() {
		return icone;
	}
	
	public void setIcone(Object icone) {
		this.icone = icone;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	
	public void instala() {
		System.out.println("Método instala");
	}
	
	public void desinstala() {
		System.out.println("Método");
	}
	
	
	public void executa() {
		System.out.println("Método executa");
	}
	
	public void abre() {
		System.out.println("Método abre");
	}
	
	public void fecha() {
		System.out.println("Método fecha");
	}
	
	public void pausa() {
		System.out.println("Método pausa");
	}
	
	public void minimiza() {
		System.out.println("Método minimiza");
	}
	
	public void paraFrente() {
		System.out.println("Método paraFrente");
	}
}







