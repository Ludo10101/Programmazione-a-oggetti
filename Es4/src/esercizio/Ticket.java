package esercizio;

public class Ticket {

	private String targa;
	private double oraArrivo;
	private int[] postoOccupato;
	
	public Ticket(String targa, double oraArrivo, int piano, int posto) {
		this.targa = targa;
		this.oraArrivo = oraArrivo;
		postoOccupato= new int[2];
		postoOccupato[0]=piano;
		postoOccupato[1]=posto;
	}


	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public double getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(double oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	public int[] getPostoOccupato() {
		return postoOccupato;
	}

	public void setPostoOccupato(int[] postoOccupato) {
		this.postoOccupato = postoOccupato;
	}
	
	

}
