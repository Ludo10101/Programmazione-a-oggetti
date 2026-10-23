package it.unipv.sfw.veicolo;

public class Taxi extends Veicolo {
	private int numLic;
	private int tassametro_val;
	
	public Taxi() {
		super("TAAA");
		this.numLic=10;
	}
	// super è il puntatore alla superclasse, super(*parametri o no*) è il costruttore della superclasse

	
	//proviamo a fare l'override del metodo toString() (non accetta parametri)
	
	@Override
	public String toString() {
		String res= "Taxi con numLic: " + numLic+ " è un veicolo: " +super.toString();
		
		return res;
	}
	
	// in questo modo non ho riscritot il codice ma l'ho riusato
	
}
