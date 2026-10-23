
public class Rettangolo {

	// Variable
	private double altezza, base;
	
	
	//Behavior
	
	 public Rettangolo(double a,double b) {
		 
		altezza=a;
		base=b;
	}
	
	 public double area() {
		return altezza*base;
	}
	
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
	public static void main ( String[] args) {
		// TODO Auto-generated method stub
		Rettangolo primoRettangolo = new Rettangolo(3,4);
		System.out.println("Questa e' l'area del rettangolo:"+ primoRettangolo.area());
		System.out.println("Questo e' il perimetro del rettangolo:"+primoRettangolo.perimetro());
		System.out.println("Questo e' la diagonale del rettangolo:"+primoRettangolo.diagonale());

	}
	

}
