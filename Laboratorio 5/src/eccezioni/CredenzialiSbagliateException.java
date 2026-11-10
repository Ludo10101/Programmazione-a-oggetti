package eccezioni;

public class CredenzialiSbagliateException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CredenzialiSbagliateException(String msg) {
		super(msg);
	}
	
	public CredenzialiSbagliateException() {
		super("Username o Password Errati.\n");
	}
	
	

}
