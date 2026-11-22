package Eccezioni;

public class NoAccountVipException extends RuntimeException{
    public NoAccountVipException(String msg){
        super(msg);
    }
    
}
