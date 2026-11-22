package Eccezioni;
public class FailedLogInException extends RuntimeException{
    public FailedLogInException(String msg){
        super(msg);
    }
    
}
