public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articolo mouse=new Articolo("123","Mouse","Informatica",5);
		Articolo tastiera=new Articolo("456","Tastiera","Informatica",40);
		Articolo monitor=new Articolo("123","Monitor","Informatica",100);
		
		Scaffale scaffInfo1=new Scaffale("Informatica",5);
		scaffInfo1.aggiungiProdotto(mouse);
		scaffInfo1.aggiungiProdotto(tastiera);
		scaffInfo1.aggiungiProdotto(monitor);
		System.out.println("Questo è il valore totale dello scaffale " + scaffInfo1.getCategoria()+": " + scaffInfo1.valoreTotale()+"\n");
		scaffInfo1.applicaScontoFlotta(10.0);
		System.out.println("Questo è il valore totale dello scaffale " + scaffInfo1.getCategoria()+": " + scaffInfo1.valoreTotale()+"\n");
	}

}
