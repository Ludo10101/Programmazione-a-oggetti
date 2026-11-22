package Contenuti;
import Main.Contenuto;

public class BranoSingolo extends Contenuto{
    public BranoSingolo(Contenuto con){
        super(con.getIsrc(),con.getId(), con.getTitolo(),con.getArtista(),con.getDurata(),con.getStream(),con.getArraySponsor());
    }

    @Override 
    public void riproduciContenuto(){
        super.setStream(super.getStream()+1);
    }
}
