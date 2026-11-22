package Main;
import java.util.ArrayList;
public abstract class Contenuto {
    private String isrc;
    private int id;
    private String titolo;
    private Persona ascoltatore;
    private Persona artista;
    private double durata;
    private int stream;
    private ArrayList<Sponsor> arraySponsor;

    public abstract void riproduciContenuto();

    public void aggiungiSponsor(Sponsor spon){
        arraySponsor.add(spon);
    }
    public void rimuoviSponsor(Sponsor spon){
        arraySponsor.remove(spon);
    }
    public double calcolaGuadagno(){
        double somma=0;
        for(Sponsor s: arraySponsor ){
            somma=somma+s.getRicavoPerStream()*stream;
        }
        return somma;
    }
    public void stampaRiepilogo(){
        System.out.println("-----RIEPILOGO DEL BRANO: -----" + titolo+
                            "\n[ISRC]: "+isrc+ "\n[ID]: "+id+
                            "\n[TITOLO]: "+ titolo+ "\n[ARTISTA]: " +artista+
                            "\n[DURATA]: "+ durata+ "[STREAM]: "+ stream );
        System.out.println("\n[SPONSOR]:\n");
        for(Sponsor s: arraySponsor){
            System.out.println(arraySponsor.indexOf(s)+")"+ s.getNome());
        }
    }

    public Contenuto(String isrc, int id, String titolo, Persona artista, double durata, int stream, ArrayList<Sponsor> arraySponsor) {
        this.isrc = isrc;
        this.id = id;
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
        this.stream = stream;
        this.arraySponsor = arraySponsor;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Persona getArtista() {
        return artista;
    }

    public void setArtista(Persona artista) {
        this.artista = artista;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public int getStream() {
        return stream;
    }

    public void setStream(int stream) {
        this.stream = stream;
    }

    public ArrayList<Sponsor> getArraySponsor() {
        return arraySponsor;
    }

    public void setArraySponsor(ArrayList<Sponsor> arraySponsor) {
        this.arraySponsor = arraySponsor;
    }
    
}
