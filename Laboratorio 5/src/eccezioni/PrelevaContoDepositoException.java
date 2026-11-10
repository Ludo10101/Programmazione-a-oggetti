package eccezioni;

public class PrelevaContoDepositoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public PrelevaContoDepositoException(String msg) {
		super(msg);
	}
	
	public PrelevaContoDepositoException() {
		super("Non si può prelevare da un conto deposito.\n");
	}
	
}
