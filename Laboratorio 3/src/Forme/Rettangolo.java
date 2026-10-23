package Forme;

import Esercizio.ColorRGB;
import Esercizio.Forma;

public class Rettangolo extends Forma{
	// Variable
	private double altezza, base;
	//Behavior
	 public Rettangolo(ColorRGB col,double a,double b) {
		super(col);
		altezza=a;
		base=b;
		
	}
	 @Override
	 public double area() {
		return altezza*base;
	}
	@Override
	public double perimetro() {
		return 2*(altezza+base);
	}
	
	public double diagonale() {
		return (Math.sqrt(Math.pow(altezza,2)+Math.pow(base,2)));
	}
	
	// Facciamo i getter e setter
	
	public double getAltezza() {
		return altezza;
	}
	public double getBase() {
		return base;
	}
	public void setAltezza(double a) {
		altezza=a;
	}
	public void setBase(double b) {
		base=b;
	}
}
