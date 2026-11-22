package veicoli;

import esercizio.TipoVeicolo;
import esercizio.Veicolo;

public class Auto extends Veicolo {
	private String tipoMotore;
	
	public Auto(String tipoMotore,String targa, double lunghezza, double larghezza, double altezza) {
		super(targa,lunghezza,larghezza,altezza,TipoVeicolo.AUTO);
		this.tipoMotore=tipoMotore;
	}
	
	public double calcolaTariffa(double ore, double sconto, double prezzoBase) {
		double somma=(ore-super.getBiglietto().getOraArrivo())*prezzoBase;
		if(tipoMotore.equals("Elettrico")) {
			return somma- somma*sconto;
		}
		return somma;
	}

	public String getTipoMotore() {
		return tipoMotore;
	}

	public void setTipoMotore(String tipoMotore) {
		this.tipoMotore = tipoMotore;
	}

	
}
