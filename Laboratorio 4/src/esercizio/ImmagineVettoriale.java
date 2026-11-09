package esercizio;


import java.util.ArrayList;
import java.util.Comparator;

public class ImmagineVettoriale extends Immagine{
	private ArrayList<Forma> listaForme;
	private double coeffProp; // E' il coefficiente di proporzionalità della formula coloreConsumato= coeffProp*AreaTot
	
	public ImmagineVettoriale(double coeffProp) {
		super();
		listaForme= new ArrayList<>();
		this.coeffProp=coeffProp;
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
		return somma*coeffProp;
	}       
		
	public void stampaImmagine() {
		for(Forma f : listaForme) {
			System.out.println(listaForme.indexOf(f)+1+") "+ "["+f.getTipo()+ "]"+ "\nArea: "+ f.area() + "\nRed: "+f.getCol().getComponent(Color.RED)+
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
	
	public void percentualeColoriPrimari() {
			double utilizzoRosso=utilizzoColorePrimario(Color.RED);
			double utilizzoVerde=utilizzoColorePrimario(Color.GREEN);
			double utilizzoBlu=utilizzoColorePrimario(Color.BLUE);
			double totale=utilizzoRosso+ utilizzoVerde+ utilizzoBlu;
			System.out.printf("[ROSSO]: %.02f %%\n[BLU]: %.02f %%\n[VERDE]: %.02f %%\n",utilizzoRosso/totale*100,utilizzoVerde/totale*100,utilizzoBlu/totale*100);
	}
	
	public ArrayList<Forma> getListaForme() {
		return listaForme;
	}

	public void setListaForme(ArrayList<Forma> listaForme) {
		this.listaForme = listaForme;
	}
	
	public double getCoeffProp() {
		return coeffProp;
	}

	public void setCoeffProp(double coeffProp) {
		this.coeffProp = coeffProp;
	}

}
