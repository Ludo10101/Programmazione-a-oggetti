package eccezioni;

public class NoLoggatoException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public NoLoggatoException(String msg) {
		super(msg);
	}
	
	public NoLoggatoException() {
		super("Prima di fare questa operazione hai bisogno di accedere\n.");
	}

}
