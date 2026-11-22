package Esercizio;

public abstract class Cliente {
	private int punti;
	private Corso[] vettoreCorsi;
	private String codiceFiscale;
	private int numeroCorsiAttuali=0;
	
	
	public Cliente(int punti, String codiceFiscale,int numeroMassimoCorsi) {
		this.punti = punti;
		this.codiceFiscale = codiceFiscale;
		vettoreCorsi=new Corso[numeroMassimoCorsi];
	}
	


	public int getPunti() {
		return punti;
	}


	public void setPunti(int punti) {
		this.punti = punti;
	}


	public Corso[] getVettoreCorsi() {
		return vettoreCorsi;
	}


	public void setVettoreCorsi(Corso[] vettoreCorsi) {
		this.vettoreCorsi = vettoreCorsi;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public static void main(String [] args) {
		Corso[] vettCorsi=new Corso[3];
		System.out.println(vettCorsi.length);
	}

}
