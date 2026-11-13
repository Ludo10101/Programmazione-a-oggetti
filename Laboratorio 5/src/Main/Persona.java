package Main;

public class Persona {
	private String nome;
	private String cognome;
	private String cf;
	private String username;
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public Persona(String nome, String cognome, String cf, String username) {
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
		this.username=username;
		this.password="ChangeMe";
	}
}
