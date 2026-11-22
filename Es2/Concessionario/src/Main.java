
public class Main {

	public static void main(String[] args) {
		Veicolo fiat1= new Veicolo("123","Fiat","Panda", 200);
		Veicolo bmw= new Veicolo("456","BMW","M3", 800);
		Veicolo ford= new Veicolo("789","Ford","Fiesta", 300);
		Veicolo lambo= new Veicolo("102","Lamborghini","Aventador", 1000);
		Veicolo fiat2= new Veicolo("378","Fiat","Punto", 200);
		ParcoAuto novara=new ParcoAuto(10);
	
		// AGGIUNGO I VEICOLI
		novara.aggiungiVeicolo(fiat1);
		novara.aggiungiVeicolo(bmw);
		novara.aggiungiVeicolo(ford);
		novara.aggiungiVeicolo(lambo);
		novara.aggiungiVeicolo(fiat2);
		
		
		// STAMPA PER DEBUG
		System.out.println("Veicoli disponibili prima del noleggio:");
		novara.stampaVeicoliDisponibili();
		novara.noleggiaVeicolo("456");
		System.out.println("Veicoli disponibili dopo il noleggio noleggio:");	
		novara.stampaVeicoliDisponibili();
		System.out.println("Questo è il prezzo medio dei veicoli disponibili: "+novara.calcolaPrezzoMedioDisponibili());
		Veicolo[] arrayFiltraPerMarca=novara.filtraPerMarca("Fiat");
		System.out.println("Questi sono i modelli di Fiat: ");
		for(int i=0;i<arrayFiltraPerMarca.length;i++) {
			System.out.println(arrayFiltraPerMarca[i].getModello());
		}
	}
}
