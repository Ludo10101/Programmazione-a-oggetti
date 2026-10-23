package veicoli;

import esercizio.TipoVeicolo;
import esercizio.Veicolo;

public class Moto extends Veicolo {
	private int cilindrata;
	private int requisitoCilindrata;
	
	public Moto(String targa, double lunghezza, double larghezza, double altezza, int cilindrata,int requisitoCilindrata) {
		super(targa, lunghezza, larghezza, altezza,TipoVeicolo.MOTO);
		this.cilindrata=cilindrata;
		this.requisitoCilindrata=requisitoCilindrata;
		
	}
	
	public double calcolaTariffa(double ora,double sconto, double prezzoBase) {
		double somma=(ora-super.getBiglietto().getOraArrivo())*prezzoBase;
		if(cilindrata>requisitoCilindrata) return somma+ sconto;
		return somma;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getRequisitoCilindrata() {
		return requisitoCilindrata;
	}

	public void setRequisitoCilindrata(int requisitoCilindrata) {
		this.requisitoCilindrata = requisitoCilindrata;
	}
	
	
}
