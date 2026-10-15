
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
	
	// Cerchio iscritto
	// il raggio del cerchio è il lato del quadrato
	public Cerchio getCerchioIscritto() {
		return new Cerchio(lato/2,x,y);
	}
	
	// Cerchio Circoscritto
	// vai sotto per alcune considerazioni
	public Cerchio getCerchioCircoscritto() {
		return new Cerchio(diagonale()/2,x,y);
	}
	public static void main ( String[] args) {
		// TODO Auto-generated method stub
		
		Quadrato primoQuadrato = new Quadrato(3,4,5);
		System.out.println("Questa e' l'area del Quadrato:"+ primoQuadrato.area());
		System.out.println("Questo e' il perimetro del Quadato:"+primoQuadrato.perimetro());
		System.out.println("Questo e' la diagonale del Quadrato:"+primoQuadrato.diagonale());
		
		// Cerchio iscritto:
		Cerchio cerchioIscritto=primoQuadrato.getCerchioIscritto();
		System.out.println("Questa e' l'area del cerchio:"+cerchioIscritto.area());
		System.out.println("Questa e' il perimetro del cerchio:"+cerchioIscritto.perimetro());
		
		// Cerchio circoscritto:
		
		Cerchio cerchioCircoscritto=primoQuadrato.getCerchioCircoscritto();
		System.out.println("Questa e' l'area del cerchio:"+cerchioCircoscritto.area());
		System.out.println("Questa e' il perimetro del cerchio:"+cerchioCircoscritto.perimetro());
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