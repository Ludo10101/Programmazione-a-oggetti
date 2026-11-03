package forme;

import esercizio.ColorRGB;
import esercizio.Forma;

public class Cerchio extends Forma {
	private double raggio;
	public Cerchio(ColorRGB col, double raggio) {
		super(col);
		this.raggio=raggio;
		
	}
	
	@Override
	public double area() {
		return (Math.PI*Math.pow(raggio,2));
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*raggio;
	}
	@Override
	public String getTipo() {
		return "Cerchio";
	}
	
	//getter
	public double getRaggio() {
		return raggio;
	}
	//setter
	
	public void setRaggio(double a) {
		raggio=a;
	}

}
