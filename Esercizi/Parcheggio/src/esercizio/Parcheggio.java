package esercizio;

public class Parcheggio {
	private Piano[] vettorePiani;
	private int numPiani=0;
	private int max;
	private double[] sconti;
	private double prezzoBase;
	
	
	public Parcheggio(int numPiani, double scontoAuto, double sovraMoto, double sovraFurgoni, double prezzoBase) {
		this.numPiani = numPiani;
		sconti= new double[3];
		sconti[TipoVeicolo.AUTO.ordinal()] = scontoAuto;
		sconti[TipoVeicolo.MOTO.ordinal()] = sovraMoto;
		sconti[TipoVeicolo.FURGONE.ordinal()] = sovraFurgoni;
		vettorePiani=new Piano[max];
		this.prezzoBase=prezzoBase;
	}
	public void aggiungiPiano(Piano p) {
		if (numPiani<max) {
			vettorePiani[numPiani]=p;
			numPiani++;
		}else {
			System.out.println("Il numero di piani nel parcheggio è massimo");
		}
	}
	
	
	// PER TROVARE IL PIANO DISPONIBILE PARTO DAI PRIMI PIANI E CONTROLLO CHE TUTTI I POSTI SIANO OCCUPATI, IL PRIMO PIANO CHE HA UN POSTO null LO RESTITUISCO
	public int trovaPianoDisponibile() {
		for(int i=0;i<vettorePiani.length;i++) {
			for(int j=0;j<(vettorePiani[i].getVettPosti()).length;j++) {
				if((vettorePiani[i].getVettPosti())[j].getVei()==null) {
					return i;
				}
			}
		}
		return -1;
	}
	
	// PER INSERIRE UN VEICOLO PRIMA TROVO L'i-esimo piano che ha un posto libero
	// poi trovo il j-esimo posto libero di quel piano, controllo che le dimensioni del veicolo v siano 
	//COMPATIBILI con il posto [i][j] ed infine se tutto va bene:
	//1)setto il veicolo in quel posto
	//2) inserisco l'ora attuale, il posto occupato e la targa nel ticket
	
	
	public void inserisciVeicolo(double oraAttuale, Veicolo v) {
		int i=trovaPianoDisponibile();
		if(i!=-1) {
			int j=vettorePiani[i].trovaPostoDisponibile();
			if(j!=-1) {
				if((vettorePiani[i].getVettPosti())[j].verificaAccesso(v)) {
					
					(vettorePiani[i].getVettPosti())[j].setVei(v);
					v.setBiglietto(new Ticket(v.getTarga(),oraAttuale,i,j));
				}
			}	
		}
	}
	
	public double uscita(double oraAttuale, Veicolo v) {
		(vettorePiani[v.getBiglietto().getPostoOccupato()[0]]).getVettPosti()[v.getBiglietto().getPostoOccupato()[1]].setVei(null);
		return v.calcolaTariffa(oraAttuale, sconti[v.getTipoVeicolo().ordinal()],prezzoBase);	
	}

	public int getNumPiani() {
		return numPiani;
	}

	public void setNumPiani(int numPiani) {
		this.numPiani = numPiani;
	}

	public double[] getSconti() {
		return sconti;
	}

	public void setSconti(double[] sconti) {
		this.sconti = sconti;
	}

	public Piano[] getVettorePiani() {
		return vettorePiani;
	}

	public void setVettorePiani(Piano[] vettorePiani) {
		this.vettorePiani = vettorePiani;
	}

	public double getPrezzoBase() {
		return prezzoBase;
	}

	public void setPrezzoBase(double prezzoBase) {
		this.prezzoBase = prezzoBase;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	

}
