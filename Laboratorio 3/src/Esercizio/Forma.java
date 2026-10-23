package Esercizio;

public abstract class Forma {
	private ColorRGB col;
	
	public Forma(ColorRGB col) {
		this.col=col;
	}

	public ColorRGB getCol() {
		return col;
	}

	public void setCol(ColorRGB col) {
		this.col = col;
	}
	
	public abstract double area();
	public abstract double perimetro();
	
}
