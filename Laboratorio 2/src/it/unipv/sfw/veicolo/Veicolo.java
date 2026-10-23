package it.unipv.sfw.veicolo;

public class Veicolo {
	private String targa;
	private String colore;
	private int numTelaio;
	
	//Costruttore di default
	public Veicolo(String targa) {
		this.targa=targa;
		colore="bianco";
		numTelaio=0;
	}
	
	public String getTarga() {
		return targa;
	}
	
	//metodi che servono ad un veicolo
	
	@Override
	public String toString() {
		return "Veicolo con Targa: " + targa+ " colore: "+colore +" numTelaio: "+numTelaio;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veicolo v = new Veicolo("AAA");
		
		System.out.println(v);
		it.unipv.sfw.veicolo.Veicolo v1= new  it.unipv.sfw.veicolo.Veicolo("AAA");
		Taxi t= new Taxi();
		System.out.println(t);
		
	}

}
