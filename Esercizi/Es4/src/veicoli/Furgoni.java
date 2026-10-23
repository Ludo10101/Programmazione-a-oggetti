package veicoli;

import esercizio.TipoVeicolo;
import esercizio.Veicolo;

public class Furgoni extends Veicolo{
	private double requisitoLunghezza;
	
	public Furgoni(String targa, double lunghezza, double larghezza, double altezza, int requisitoLunghezza) {
		super(targa, lunghezza, larghezza, altezza,TipoVeicolo.FURGONE);
		this.requisitoLunghezza=requisitoLunghezza;
	}
	
	public double calcolaTariffa(double ore, double sconto, double prezzoBase) {
		if(requisitoLunghezza>super.getLunghezza()) return ((ore-super.getBiglietto().getOraArrivo())*(sconto+prezzoBase));
		
		return (ore-super.getBiglietto().getOraArrivo())*prezzoBase;
	}

	public double getRequisitoLunghezza() {
		return requisitoLunghezza;
	}

	public void setRequisitoLunghezza(double requisitoLunghezza) {
		this.requisitoLunghezza = requisitoLunghezza;
	}
	
	

}
