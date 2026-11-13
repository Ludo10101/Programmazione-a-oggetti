package esercizio;

public class Cartuccia {
	private double livello;
	private Color colore;
	
	public Cartuccia(double livello, Color colore) {
		this.livello=livello;
		this.colore=colore;
	}

	public void consumoLivello(double consumo){
		if(livello<consumo) throw new ColoreInsufficenteException(colore,consumo,livello);
		livello=livello-consumo;

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
