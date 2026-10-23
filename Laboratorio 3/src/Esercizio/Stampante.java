package Esercizio;

public class Stampante {
	private int numeroMaxImmagini;
	private int numeroImmaginiAttuale=0;
	private Immagine[] vettoreImmagini;
	private Cartuccia[] vettoreCartucce;
	
	public Stampante(int numeroMaxImmagini, double colR, double colG, double colB ) {
		this.numeroMaxImmagini=numeroMaxImmagini;
		vettoreCartucce=new Cartuccia[3];
		vettoreImmagini=new Immagine[numeroMaxImmagini];
		inizializzaCartucce(colR,colG,colB);
	}
	public void aggiungiImmagine(Immagine img) {
		if(numeroImmaginiAttuale<numeroMaxImmagini) {
			vettoreImmagini[numeroImmaginiAttuale]=img;
			numeroImmaginiAttuale++;
		}
	}
	public void inizializzaCartucce(double colR, double colG, double colB ) {
		vettoreCartucce[Color.RED.ordinal()]= new Cartuccia(colR, Color.RED);
		vettoreCartucce[Color.GREEN.ordinal()]= new Cartuccia(colG, Color.GREEN);
		vettoreCartucce[Color.BLUE.ordinal()]=new Cartuccia(colB, Color.BLUE);
	}
	
	public void fornireLivelloCartucce() {
		System.out.println("Il livello delle cartucce è il seguente:");
		System.out.println("Rosso: "+vettoreCartucce[Color.RED.ordinal()].getLivello()+ "\nVerde: "+vettoreCartucce[Color.GREEN.ordinal()].getLivello()+"\nBlu: "+vettoreCartucce[Color.BLUE.ordinal()].getLivello() );
	}
	public double quantoInchiostro(Color col) {
		return vettoreCartucce[col.ordinal()].getLivello();
	}
	
	public void stampaImmagine() {
		for(int i=0;i<numeroImmaginiAttuale;i++) {
			// solo se sono sufficienti tutti e 3 i colori stampo altrimenti no
			if((vettoreCartucce[Color.RED.ordinal()].getLivello()>= vettoreImmagini[i].utilizzoColorePrimario(Color.RED))&&
				(vettoreCartucce[Color.GREEN.ordinal()].getLivello()>= vettoreImmagini[i].utilizzoColorePrimario(Color.GREEN))&&
				(vettoreCartucce[Color.BLUE.ordinal()].getLivello()>= vettoreImmagini[i].utilizzoColorePrimario(Color.BLUE))) {
				
				vettoreCartucce[Color.RED.ordinal()].setLivello(vettoreCartucce[Color.RED.ordinal()].getLivello() - vettoreImmagini[i].utilizzoColorePrimario(Color.RED));
				vettoreCartucce[Color.GREEN.ordinal()].setLivello(vettoreCartucce[Color.GREEN.ordinal()].getLivello() - vettoreImmagini[i].utilizzoColorePrimario(Color.GREEN));
				vettoreCartucce[Color.BLUE.ordinal()].setLivello(vettoreCartucce[Color.BLUE.ordinal()].getLivello() - vettoreImmagini[i].utilizzoColorePrimario(Color.BLUE));
				}
			else {
				System.out.println("Ricaricare il livello delle cartucce");
			}
		}
		// DOPO AVER STAMPATO (ANCHE SE CI SONO STATE STAMPE FALLIMENTARI) RESETTO IL CONTATORE DELLE IMMAGINI ATTUALI
		numeroImmaginiAttuale=0;
	}
	public void sostituzioneCartuccia(Color col, double quantita) {
		vettoreCartucce[col.ordinal()].setLivello(quantita);
	}
	public int getNumeroMaxImmagini() {
		return numeroMaxImmagini;
	}


	public void setNumeroMaxImmagini(int numeroMaxImmagini) {
		this.numeroMaxImmagini = numeroMaxImmagini;
	}


	public int getNumeroImmaginiAttuale() {
		return numeroImmaginiAttuale;
	}


	public void setNumeroImmaginiAttuale(int numeroImmaginiAttuale) {
		this.numeroImmaginiAttuale = numeroImmaginiAttuale;
	}


	public Immagine[] getVettoreImmagini() {
		return vettoreImmagini;
	}


	public void setVettoreImmagini(Immagine[] vettoreImmagini) {
		this.vettoreImmagini = vettoreImmagini;
	}


	public Cartuccia[] getVettoreCartucce() {
		return vettoreCartucce;
	}


	public void setVettoreCartucce(Cartuccia[] vettoreCartucce) {
		this.vettoreCartucce = vettoreCartucce;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
