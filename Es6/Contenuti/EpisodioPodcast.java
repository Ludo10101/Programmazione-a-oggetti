package Contenuti;
import Eccezioni.EtaNonValidaException;
import Main.Contenuto;
public class EpisodioPodcast extends Contenuto{
    private int sogliaEta;
    private int numEpisodio;
    private boolean flagEta;

    public EpisodioPodcast(Contenuto con, int sogliaEta, int numEpisodio){
        super(con.getIsrc(),con.getId(), con.getTitolo(),con.getArtista(),con.getDurata(),con.getStream(),con.getArraySponsor());
        this.sogliaEta=sogliaEta;
        this.numEpisodio=numEpisodio;
        this.flagEta=false;
    }
    public void verificaEta(int eta){
        if(eta<sogliaEta) throw new EtaNonValidaException("L'utente ha un eta' inferiore al minimo consentito per la visione di questo contenuto.\n");
        flagEta=true;
    }
    
    @Override
    public void riproduciContenuto(){
        if(!flagEta) throw new EtaNonValidaException("L'utente ha un eta' inferiore al minimo consentito per la visione di questo contenuto.\n");
        super.setStream(super.getStream()+1);
    }
    public int getSogliaEta() {
        return sogliaEta;
    }
    public void setSogliaEta(int sogliaEta) {
        this.sogliaEta = sogliaEta;
    }
    public int getNumEpisodio() {
        return numEpisodio;
    }
    public void setNumEpisodio(int numEpisodio) {
        this.numEpisodio = numEpisodio;
    }
    public boolean isFlagEta() {
        return flagEta;
    }
    public void setFlagEta(boolean flagEta) {
        this.flagEta = flagEta;
    }
    
}