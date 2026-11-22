package Main;
import java.util.ArrayList;
public class Account {
     private Persona per;
     private ArrayList<Contenuto> arrayContenuto;

    public void riproduciContenuto(Contenuto con){
        con.riproduciContenuto();
    }
    public void aggiungiContenuto(Contenuto acc){
        arrayContenuto.add(acc);
    }
    public void rimuoviContenuto(Contenuto acc){
        arrayContenuto.remove(acc);
    }
    
    public Account(Persona per, ArrayList<Contenuto> arrayContenuto) {
        this.per = per;
        this.arrayContenuto = arrayContenuto;
    }
    public Persona getPer() {
        return per;
    }
    public void setPer(Persona per) {
        this.per = per;
    }
    public ArrayList<Contenuto> getArrayContenuto() {
        return arrayContenuto;
    }
    public void setArrayContenuto(ArrayList<Contenuto> arrayContenuto) {
        this.arrayContenuto = arrayContenuto;
    }
    
}
