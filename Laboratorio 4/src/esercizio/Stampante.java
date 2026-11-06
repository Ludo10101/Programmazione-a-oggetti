package esercizio;


public class Stampante {
	private Stampabile s; // NON METTERLO COME DATO INTERNO MA COME PARAMETRO PASSATO
	private Cartuccia[] vettoreCartucce;
	
	public Stampante(Stampabile s, double[] liv ) {
		this.s=s;
		vettoreCartucce=new Cartuccia[3];
		if(liv.length!=3) throw new IllegalArgumentException("Inserire un vettore double di dimensione 3.");
		inizializzaCartucce(liv);
	}

	public void inizializzaCartucce(double[] liv ) {
		if(liv.length!=3) throw new IllegalArgumentException("Inserire un vettore double di dimensione 3.");
		for(Color col: Color.values()) {
			vettoreCartucce[col.ordinal()]=new Cartuccia(liv[col.ordinal()], col);
		}
	}
	
	public void fornireLivelloCartucce() {
		System.out.println("Il livello delle cartucce è il seguente:");
		System.out.println("Rosso: "+vettoreCartucce[Color.RED.ordinal()].getLivello()+ "\nVerde: "+vettoreCartucce[Color.GREEN.ordinal()].getLivello()+"\nBlu: "+vettoreCartucce[Color.BLUE.ordinal()].getLivello() );
	}
	public double quantoInchiostro(Color col) {
		return vettoreCartucce[col.ordinal()].getLivello();
	}
	
	public void stampaImmagine() { // PRENDI COME ARGOMENTO UN OGGETTO STAMPABILE
		for(Color col : Color.values()) {
			if(vettoreCartucce[col.ordinal()].getLivello()< s.utilizzoColorePrimario(col)) {
				throw new IllegalArgumentException("L'oggetto stampabile consuma troppo colore rispetto a quello che contiene la stampante.");
			}
			vettoreCartucce[col.ordinal()].setLivello(vettoreCartucce[col.ordinal()].getLivello()-s.utilizzoColorePrimario(col)); 
		}
	}
	public void sostituzioneCartuccia(Color col, double quantita) {
		vettoreCartucce[col.ordinal()].setLivello(quantita);
	}
	public Stampabile getStampabile() {
		return s;
	}
	public void setStampabile(Stampabile s) {
		this.s=s;
	}

	public Cartuccia[] getVettoreCartucce() {
		return vettoreCartucce;
	}


	public void setVettoreCartucce(Cartuccia[] vettoreCartucce) {
		this.vettoreCartucce = vettoreCartucce;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// RICORDA DI METTERE IL TRY CATCH 
	}

}
