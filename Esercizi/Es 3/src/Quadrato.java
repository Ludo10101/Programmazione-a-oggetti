
public class Quadrato {

	// Variable
	private double lato, x,y;
	
	
	//Behavior
	
	 public Quadrato(double a, double b, double c) {
		 
		lato=a;
		x=b;
		y=c;
	}
	
	 public double area() {
		return Math.pow(lato, 2);
	}
	
	public double perimetro() {
		return 4*lato;
	}
	
	public double diagonale() {
		return (Math.sqrt(2*Math.pow(lato,2)));
	}
	
	// Facciamo i getter e setter
	
	public double getLato() {
		return lato;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setLato(double a) {
		lato=a;
	}
	public void setX(double b) {
		x=b;
	}
	public void setY(double a) {
		y=a;
	}
	

}

/*Per fare il metodo Cerchio Circoscritto mi è venuto comodo usare già un metodo fatto in precedenza
 * Mi è venuto da dire però:
 * COME FACCIO A CHIAMARE UN METODO SE NON HO ALCUNA ISTANZA?.
 * 
 * LA RISPOSTA E':
 * Se dentro una classe ho metodo1 e metodo 2, e supponiamo che dentro metodo 2 io debba chiamare metodo 1
 * non serve un istanza, l'istanza implicita è "this". Quando andrò a chiamare metodo 2 nel main verrà eseguito metodo 1 
 * e poi restituirà ciò che serve a metodo 2 
 */