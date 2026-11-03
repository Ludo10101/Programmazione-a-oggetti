package esercizio;


import java.util.ArrayList;
import java.util.Comparator;

public class ImmagineVettoriale extends Immagine{
	private ArrayList<Forma> listaForme;
	
	public ImmagineVettoriale() {
		super();
		listaForme= new ArrayList<>();
	}
	
	public void aggiungiForma(Forma f) {
		listaForme.add(f);
	}

	// IL PARAMETRO PASSATO A QUESTA FUNZIONE E' UN COLORE PRIMARIO: RED, GREEN BLUE
	public double utilizzoColorePrimario(Color col) {
		double somma=0;
		for(Forma f : listaForme) {
			somma=somma+f.getCol().getComponent(col)*f.area();
		}
		return somma;
	}       
		
	public void stampaImmagine() {
		for(Forma f : listaForme) {
			System.out.println(f.getTipo()+ "Area: "+ f.area() + "\nRed: "+f.getCol().getComponent(Color.RED)+
								"\nGreen: "+f.getCol().getComponent(Color.GREEN)+
								"\nBlue: " +f.getCol().getComponent(Color.BLUE));
		}
	}
	
	public void ordinamentoArea() {
		Comparator<Forma> comparaPerArea= new Comparator<Forma>(){
			@Override
			public int compare(Forma i, Forma j) {
				return Double.compare(i.area(),j.area());
			}
		};
		listaForme.sort(comparaPerArea);
	}
	
	public ArrayList<Forma> getListaForme() {
		return listaForme;
	}

	public void setListaForme(ArrayList<Forma> listaForme) {
		this.listaForme = listaForme;
	}
	
}
