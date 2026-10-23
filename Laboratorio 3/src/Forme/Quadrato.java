package Forme;

import Esercizio.ColorRGB;
import Esercizio.Forma;

public class Quadrato extends Forma {

	// Variable
	private double lato;
	
	
	//Behavior
	
	
	public Quadrato(ColorRGB col, double lato)  {
		super(col);
		this.lato=lato;
	}
	@Override
	public double area() {
		return Math.pow(lato, 2);
	}
	@Override
	public double perimetro() {
		return 4*lato;
	}
	
	public double diagonale() {
		return (Math.sqrt(2*Math.pow(lato,2)));
	}
	
	
	public double getLato() {
		return lato;
	}

	public void setLato(double a) {
		lato=a;
	}

}

		
		