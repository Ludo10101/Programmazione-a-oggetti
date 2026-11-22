
public class Articolo {
	private String codice;
	private String nome;
	private String categoria;
	 private double prezzoBase;
	
	
	// Costruttore 
	
	public Articolo(String a, String b,String c, double d) {
		codice=a;
		nome=b;
		categoria=c;
		prezzoBase=d;
		
	}

	// Getter and Setter
	
	public String getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public double getPrezzoBase() {
		return prezzoBase;
	}
	
	
	
	public void setCodice(String a) {
		codice=a;
	}
	
	public void setNome(String a) {
		nome=a;
	}
	
	public void setCategoria(String a) {
		categoria=a;
	}
	public void setPrezzoBase(double a) {
		prezzoBase=a;
	}
	
	public double calcolaPrezzoScontato(double a) {
		return prezzoBase-prezzoBase*a/100;
	}
	
	public void applicaSconto(double a) {
		prezzoBase=calcolaPrezzoScontato(a);
		
	}
			
}
