package esercizio;

import forme.Rettangolo;
import forme.Quadrato;

public class Stampante {
	private Stampabile s;
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
	
	public void stampaImmagine() {
		for(Color col : Color.values()) {
			if(vettoreCartucce[col.ordinal()].getLivello()< s.utilizzoColorePrimario(col)) {
				throw new ColoreInsufficenteException(col,s.utilizzoColorePrimario(col),vettoreCartucce[col.ordinal()].getLivello());
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
		try {
			ImmagineVettoriale immagine1=new ImmagineVettoriale(2);
			ColorRGB colore1=new ColorRGB(24,25,26);
			Rettangolo rett1=new Rettangolo(colore1, 4, 5);
			immagine1.aggiungiForma(rett1);
			ColorRGB colore2=new ColorRGB(25,26,27);
			Quadrato quadrato1=new Quadrato(colore2,2);
			immagine1.aggiungiForma(quadrato1);
			
			
			double[] livelliIniziali= {1200,1300,1300};
			Stampante stamp=new Stampante(immagine1,livelliIniziali);
			
			stamp.fornireLivelloCartucce();
			stamp.stampaImmagine();
			stamp.fornireLivelloCartucce();
			
			immagine1.stampaImmagine();
			immagine1.percentualeColoriPrimari();
		}catch(ColoreInsufficenteException e) {
			System.out.println("Inserisci altro colore\n");
		}catch(IllegalArgumentException e) {
			System.out.println("Inserisci un Vettore di double di 3 elementi\n");
		}
		// RICORDA DI METTERE IL TRY CATCH 
		
	}

}
