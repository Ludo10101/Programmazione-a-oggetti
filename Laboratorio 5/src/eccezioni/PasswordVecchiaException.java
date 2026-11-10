package eccezioni;

public class PasswordVecchiaException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public PasswordVecchiaException(String msg) {
		super(msg);
	}
	public PasswordVecchiaException() {
		System.out.println("Non puoi eseguire operazioni finchè non cambi la password\n");
	}

}
