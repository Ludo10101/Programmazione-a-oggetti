
public class Scaffale {
	private String categoria;
	private Articolo[] arrayArticoli;
	private int numeroArticoli=0;
	private int capacita;
	
	public Scaffale(String cat, int cap) {
		categoria=cat;
		arrayArticoli=new Articolo[cap];
		capacita=cap;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public boolean aggiungiProdotto(Articolo p) {
		if(categoria.equals(p.getCategoria())) {
			if(numeroArticoli < capacita) {
				arrayArticoli[numeroArticoli]= p;
				numeroArticoli++;
				return true;
			}else {
				System.out.println("Non c'è più spazio nello scaffale\n");
				return false;
			}
		}else {
			System.out.println("La categoria del Prodotto non corrisponde a quella dello scaffale\n");
			return false;
		}
			
	}
	
	public double valoreTotale() {
		double somma=0;
		for(int i=0;i<numeroArticoli;i++) {
			somma=somma+arrayArticoli[i].getPrezzoBase();
		}
		return somma;
	}
	
	public void applicaScontoFlotta(double a) {
		for(int i=0;i<numeroArticoli;i++) {
			arrayArticoli[i].applicaSconto(a);
		}
	}

}
