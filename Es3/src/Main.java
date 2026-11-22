
public class Main {

	public static void main(String[] args) {

		Quadrato[] array=new Quadrato[4];
		array[0]= new Quadrato(3,4,5);
		array[1]= new Quadrato(1,2,3);
		array[2]= new Quadrato(6,7,8);
		array[3]= new Quadrato(9,10,11);
		
		GestoreQuadrati gestore=new GestoreQuadrati(array);
		
		//STAMPE
		System.out.println("La somma totale delle aree è: "+gestore.sommaAree());
		gestore.getQuadratoPiuGrande();
		int i=gestore.getIndiceAreaMaggiore();
		System.out.println("Il lato e il centro (x,y) del quadrato più grande trovato sono: "+array[i].getLato()+" ("+array[i].getX()+","+array[i].getY()+")");
		int soglia=25;
		System.out.println("Il numero di Quadrati che superano la soglia di Area = "+soglia+" sono: "+gestore.contaQuadratiConAreaMaggioreDi(soglia));
		
		
		/*
		 *     4. Metodo main di prova (puoi metterlo in GestoreQuadrati o in una classe Main separata): 
        ◦ Crea un array di 4 o 5 oggetti Quadrato con lati e coordinate a tua scelta. 
        ◦ Istanzia un oggetto GestoreQuadrati passandogli l'array creato.
        ◦ Stampa a schermo:
            1. La somma totale delle aree.
            2. Il lato e il centro $(x, y)$ del quadrato più grande trovato. 
            3. Quanti quadrati superano una certa area di soglia scelta da te.

		 * 
		 * 
		 * */

	}

}
