package eccezioni;

public class NoAbbastanzaSoldiException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NoAbbastanzaSoldiException(String mess) {
		super(mess);
	}

	public NoAbbastanzaSoldiException(String causa, double soldiRichiesti, double soldiAttuali) {
		System.out.println("L'account: "+ causa+ " richiede: "+ soldiRichiesti+ " ma sono disponibili solo: "+soldiAttuali);
	}
}
