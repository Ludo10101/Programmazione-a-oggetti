package Eccezioni;
public class CredenzialiSbagliateException extends RuntimeException{
    private String passSbagliata;

    public CredenzialiSbagliateException(String msg){
        super(msg);
    }

    public CredenzialiSbagliateException(String msg,String passSbagliata){
        super(msg);
        this.passSbagliata=passSbagliata;
    }

    public String getPassSbagliata() {
        return passSbagliata;
    }

    public void setPassSbagliata(String passSbagliata) {
        this.passSbagliata = passSbagliata;
    }
    
}