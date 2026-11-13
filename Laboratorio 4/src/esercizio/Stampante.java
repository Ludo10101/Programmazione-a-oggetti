package esercizio;

import forme.Rettangolo;

import java.util.Scanner;

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
			try{
				vettoreCartucce[col.ordinal()].consumoLivello(s.utilizzoColorePrimario(col));
			}catch(ColoreInsufficenteException e){
				Scanner scanner=new Scanner(System.in);
				System.out.println("Inserisci la quantità di colore con cui ricarichi la cartuccia " +col.name());
				double valore=scanner.nextDouble();
				sostituzioneCartuccia(col,valore );
				scanner.close();
				vettoreCartucce[col.ordinal()].consumoLivello(s.utilizzoColorePrimario(col));
			}
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
		
		ImmagineVettoriale immagine1=new ImmagineVettoriale(2);
		immagine1.aggiungiForma(new Rettangolo(new ColorRGB(24,25,26), 4, 5));			
		immagine1.aggiungiForma(new Quadrato(new ColorRGB(25,26,27),2));
			
			
		double[] livelliIniziali= {1100,1300,1300};
		Stampante stamp=new Stampante(immagine1,livelliIniziali);
		try{
			stamp=new Stampante(immagine1,livelliIniziali);
			
		}catch(IllegalArgumentException e) {
			System.out.println("Inserisci un Vettore di double di 3 elementi\n");
			return;
		}
		
		System.out.println("Ciao\n\n\n");
		stamp.fornireLivelloCartucce();
		stamp.stampaImmagine();
		stamp.fornireLivelloCartucce();

		immagine1.stampaImmagine();
		immagine1.percentualeColoriPrimari();
	}
}
