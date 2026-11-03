package esercizio;

public class Pixel {
	private ColorRGB colore;
	private final double areaPixel;

	public ColorRGB getColore() {
		return colore;
	}

	public void setColore(ColorRGB colore) {
		this.colore = colore;
	}

	public Pixel(ColorRGB colore, double areaPixel) {
		super();
		this.colore = colore;
		this.areaPixel=areaPixel;
	}

	public double getAreaPixel() {
		return areaPixel;
	}
	
	
}
