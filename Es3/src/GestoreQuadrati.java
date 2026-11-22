
public class GestoreQuadrati {

	private Quadrato[] arrayQuadrati;
	private int indiceAreaMaggiore=0;
	
	public GestoreQuadrati(Quadrato[] array) {
		arrayQuadrati=array;
	}
	public int getIndiceAreaMaggiore() {
		return indiceAreaMaggiore;
	}
	public double sommaAree() {
		double somma=0;
		for(int i=0;i<arrayQuadrati.length;i++) {
			somma=somma+arrayQuadrati[i].area();
		}
		return somma;
	}
	
	public double getQuadratoPiuGrande() {
		double max=arrayQuadrati[0].area();
		for(int i=1;i<arrayQuadrati.length;i++) {
			if(max<arrayQuadrati[i].area()) {
				max=arrayQuadrati[i].area();
				indiceAreaMaggiore=i;
			}
		}
		
		return max;
	}
	public int contaQuadratiConAreaMaggioreDi(double soglia) {
		int a=0;
		for(int i=0;i<arrayQuadrati.length;i++) {
			if(arrayQuadrati[i].area()<soglia) {
				a++;
			}
		}
		return a;
	}
}
