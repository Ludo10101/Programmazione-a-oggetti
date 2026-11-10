package eccezioni;

public class CredenzialiSbagliateException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CredenzialiSbagliateException(String msg) {
		super(msg);
	}
	
	public CredenzialiSbagliateException() {
		System.out.println("Username o Password Errati.\n");
	}
	
	

}
