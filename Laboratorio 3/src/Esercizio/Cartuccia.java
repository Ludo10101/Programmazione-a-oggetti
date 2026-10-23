package Esercizio;

public class Cartuccia {
	private double livello;
	private Color colore;
	
	public Cartuccia(double livello, Color colore) {
		this.livello=livello;
		this.colore=colore;
	}

	public double getLivello() {
		return livello;
	}

	public void setLivello(double livello) {
		this.livello = livello;
	}

	public Color getColore() {
		return colore;
	}

	public void setColore(Color colore) {
		this.colore = colore;
	}
	
	
}
