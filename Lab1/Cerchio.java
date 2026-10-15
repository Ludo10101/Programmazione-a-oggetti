
public class Cerchio {
	private double raggio, x, y;
	
	public Cerchio(double a, double b,double c) {
		raggio=a;
		x=b;
		y=c;
		
	}
	
	public double area() {
		return (Math.PI*Math.pow(raggio,2));
	}
	
	public double perimetro() {
		return 2*Math.PI*raggio;
	}
	
	
	//getter
	public double getRaggio() {
		return raggio;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//setter
	
	public void setRaggio(double a) {
		raggio=a;
	}
	public void setX(double a) {
		x=a;
	}
	public void setY(double a) {
		y=a;
	}
	// VAI IN FONDO PER ALCUNE CONSIDERAZIONI
	public Quadrato getQuadratoCircoscritto() {
		Quadrato quadratoCircoscritto = new Quadrato(2*raggio,x,y);
		return quadratoCircoscritto;
	}
	
	public Quadrato getQuadratoIscritto() {
		double lato;
		lato=Math.sqrt(2)*raggio;
		Quadrato quadratoIscritto=new Quadrato(lato,x,y);
		return quadratoIscritto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cerchio primoCerchio=new Cerchio(3,4,5);
		System.out.println("Questa e' l'area del cerchio:"+primoCerchio.area());
		System.out.println("Questa e' il perimetro del cerchio:"+primoCerchio.perimetro());
		
		// QUADRATO CIRCOSCRITTO:
		Quadrato quadratoCircoscritto= primoCerchio.getQuadratoCircoscritto();
		
		System.out.println("Questa e' l'area del Quadrato:"+ quadratoCircoscritto.area());
		System.out.println("Questo e' il perimetro del Quadato:"+quadratoCircoscritto.perimetro());
		System.out.println("Questo e' la diagonale del Quadrato:"+quadratoCircoscritto.diagonale());
		System.out.println("Questo e' la X del Quadrato:"+quadratoCircoscritto.getX());
		System.out.println("Questo e' la Y del Quadrato:"+quadratoCircoscritto.getY());
		
		// QUADRATO ISCRITTO
		Quadrato quadratoIscritto= primoCerchio.getQuadratoIscritto();
		
		System.out.println("Questa e' l'area del Quadrato:"+ quadratoIscritto.area());
		System.out.println("Questo e' il perimetro del Quadato:"+quadratoIscritto.perimetro());
		System.out.println("Questo e' la diagonale del Quadrato:"+quadratoIscritto.diagonale());
		System.out.println("Questo e' la X del Quadrato:"+quadratoIscritto.getX());
		System.out.println("Questo e' la Y del Quadrato:"+quadratoIscritto.getY());
		
	}
	

}
/*La parte più complessa dell'esercizio era quella di scrivere un metodo che mettesse in relazione 2 classi,
 * Cosa ho imparato:
 * 
 * 1) Se i metodi lavorano con parametri interni alla classe non bisogna fare alcun passaggio.
 * Il passaggio di parametri avviene solo esclusivamente se un metodo ha bisogno di dati che appartengono ad una 
 * classe diversa rispetto a quella di dove si trova il metodo
 * 
 * 2)Il metodo che ho scritto restituisce un puntatore a Quadrato, questo puntatore lo si ottiene chiamando 
 * il new allìinterno del metodo, poi qunado chiamo la funizone nel main devo dichiarare una nuova variabile
 * quadrato e assegnarle il valore di quel puntatore*/
