public class Veicolo{
    private String targa; // (Stringa, es. "AB123CD")
    private String marca; // (Stringa, es. "Fiat")
    private String modello; // (Stringa, es. "Panda")
    private double prezzoGiornaliero; // (double, es. 45.0)
    private boolean noleggiato; // (boolean: true se l'auto è attualmente occupata, false se è libera in parcheggio)


    public Veicolo(String a, String b, String c, double d){
    	targa=a;
    	marca=b;
    	modello=c;
    	prezzoGiornaliero=d;
    	noleggiato=false;
    }
    
    // GETTER:
    
    public String getTarga() {
    	return targa;
    }
    
    public String getMarca() {
    	return marca;
    }
    
    public String getModello() {
    	return modello;
    }
    
    public double getPrezzoGiornaliero() {
    	return prezzoGiornaliero;
    }
    
    public boolean getNoleggiato() {
    	return noleggiato;
    }
    
    // SETTER:
    
    public void setTarga(String a) {
    	targa=a;
    }
    
    public void setMarca(String a) {
    	marca=a;
    }
    public void setModello(String a) {
    	modello=a;
    }
    public void setPrezzoGiornaliero(double a) {
    	prezzoGiornaliero=a;
    }
    public void setnoleggiato(boolean a) {
    	noleggiato=a;
    }
    
    // METODI:
    
    public boolean noleggia() {
    	if(noleggiato==false) {
    		noleggiato=true;
    		return true;
    	}else {
    		return false;
    	}
    }

    public boolean restituisci() {
    	if(noleggiato==true) {
    		noleggiato=false;
    		return true;
    	}else {
    		return false;
    	}
    }
}