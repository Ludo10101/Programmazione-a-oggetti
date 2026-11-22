package Contenuti;
import Main.Contenuto;
import Main.Persona;
import Eccezioni.NoAccountVipException;

public class BranoEsclusivo extends Contenuto{
    private boolean flagUtenteEsclusivo;
    
    public void riproduciContenuto(){
        if(!flagUtenteEsclusivo) throw new NoAccountVipException("Per poter accedere a questo contenuto bisogna abbonarsi.\n");

    }
    
}
