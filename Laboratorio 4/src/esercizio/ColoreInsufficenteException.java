package esercizio;

public class ColoreInsufficenteException extends RuntimeException{
	private Color col;
	private double richiesto;
	private double attuale;

	public Color getCol() {
		return col;
	}

	public void setCol(Color col) {
		this.col = col;
	}

	public double getRichiesto() {
		return richiesto;
	}

	public void setRichiesto(double richiesto) {
		this.richiesto = richiesto;
	}

	public double getAttuale() {
		return attuale;
	}

	public void setAttuale(double attuale) {
		this.attuale = attuale;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public ColoreInsufficenteException(String messaggio) {
		super(messaggio);
	}
	
	public ColoreInsufficenteException(Color col,  double richiesto,double attuale) {
		System.out.println("[ERRORE]:\nLa quantità di "+col.name()+ " richiesta: "+ richiesto +" è troppa, la quantità disponibile è: "+ attuale);
	}
}
