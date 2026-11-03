package esercizio;

public class ImmagineRaster extends Immagine{
	private Pixel[][] matricePixel;
	private int maxi;
	private int maxj;
	
	public ImmagineRaster(int maxi, int maxj) {
		this.maxi=maxi;
		this.maxj=maxj;
		matricePixel=new Pixel[maxi][maxj];
	}

	public double utilizzoColorePrimario(Color col) {
		double somma=0;
		for(int i=0;i<maxi;i++) {
			for(int j=0;j<maxj;j++) {
				somma=somma+matricePixel[i][j].getColore().getComponent(col);
			}
		}
		return somma;
	}
	
	public void stampaImmagine() {
		double sommaRosso=0;
		double sommaVerde=0;
		double sommaBlu=0;
		for(int i=0;i<maxi;i++) {
			for(int j=0;j<maxj;j++) {
				sommaRosso+= matricePixel[i][j].getColore().getComponent(Color.RED)*matricePixel[i][j].getAreaPixel();
				sommaVerde+= matricePixel[i][j].getColore().getComponent(Color.GREEN)*matricePixel[i][j].getAreaPixel();
				sommaBlu+= matricePixel[i][j].getColore().getComponent(Color.BLUE)*matricePixel[i][j].getAreaPixel();
			}
		}
		double areaTotale=sommaRosso+sommaVerde+sommaBlu;
		System.out.println("Percentuale Rosso: " + sommaRosso/areaTotale*100+"%"+
						 "\nPercentuale Verde: " +sommaVerde/areaTotale*100+"%"+
						 "\nPercentuale Blu: " +sommaBlu/areaTotale*100+"%" );
		
	}
	public Pixel[][] getMatricePixel() {
		return matricePixel;
	}

	public void setMatricePixel(Pixel[][] matricePixel) {
		this.matricePixel = matricePixel;
	}

	public int getMaxi() {
		return maxi;
	}

	public void setMaxi(int maxi) {
		this.maxi = maxi;
	}

	public int getMaxj() {
		return maxj;
	}

	public void setMaxj(int maxj) {
		this.maxj = maxj;
	}
	
	

}
