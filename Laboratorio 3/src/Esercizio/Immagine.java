package Esercizio;

public class Immagine {
	private Forma[] vettoreForme;
	private int numFormeAttuali=0;
	private int numMaxForme;
	
	public Immagine(int numMaxForme) {
		this.numMaxForme=numMaxForme;
		vettoreForme=new Forma[numMaxForme];
	}
	public void aggiungiForma(Forma frm) {
		if(numFormeAttuali<numMaxForme) {
			vettoreForme[numFormeAttuali]=frm;
			numFormeAttuali++;
		}
	}
	// IL PARAMETRO PASSATO A QUESTA FUNZIONE E' UN COLORE PRIMARIO: RED, GREEN BLUE
	public double utilizzoColorePrimario(Color col) {
		double somma=0;
		for(int i=0;i<numFormeAttuali;i++) {
			somma+= vettoreForme[i].getCol().getComponent(col)*vettoreForme[i].area();
		}
		return somma;
	}
	
	public Forma[] getVettoreForme() {
		return vettoreForme;
	}

	public void setVettoreForme(Forma[] vettoreForme) {
		this.vettoreForme = vettoreForme;
	}

	public int getNumFormeAttuali() {
		return numFormeAttuali;
	}

	public void setNumFormeAttuali(int numFormeAttuali) {
		this.numFormeAttuali = numFormeAttuali;
	}

	public int getNumMaxForme() {
		return numMaxForme;
	}

	public void setNumMaxForme(int numMaxForme) {
		this.numMaxForme = numMaxForme;
	}
	
}
