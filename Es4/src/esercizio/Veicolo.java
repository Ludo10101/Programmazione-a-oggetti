package esercizio;

public abstract class Veicolo {
	private String targa;
	private TipoVeicolo t;
	private Ticket biglietto;
	private double lunghezza ;
	private double larghezza;
	private double altezza;
	
	public Veicolo(String targa, double lunghezza, double larghezza, double altezza, TipoVeicolo t) {
		this.targa=targa;
		this.biglietto=null;
		this.lunghezza=lunghezza;
		this.larghezza=larghezza;
		this.altezza=altezza;
		this.t=t;
	}
	
	public abstract double calcolaTariffa(double ore, double sconto,double prezzoBase);

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Ticket getBiglietto() {
		return biglietto;
	}

	public void setBiglietto(Ticket biglietto) {
		this.biglietto = biglietto;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public TipoVeicolo getTipoVeicolo() {
		return t;
	}
	
	public void setTipoVeicolo(TipoVeicolo t) {
		this.t=t;
	}
	
	
}
