package esercizio;

public class ColoreInsufficenteException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ColoreInsufficenteException(String messaggio) {
		super(messaggio);
	}
	
	public ColoreInsufficenteException(Color col,  double richiesto,double attuale) {
		System.out.println("[ERRORE]:\nLa quantità di "+col.name()+ " richiesta: "+ richiesto +" è troppa, la quantità disponibile è: "+ attuale);
	}
}
