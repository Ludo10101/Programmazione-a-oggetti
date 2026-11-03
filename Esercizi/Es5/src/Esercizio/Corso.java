package Esercizio;

public abstract class Corso {
	private double costoMensile;
	private int numeroMassimoPosti;
	private Cliente[] vettoreClientiIscritti;
	
	public Corso(double costoMensile, int numeroMassimoPosti, Cliente [] vettoreClientiIscritti) {
		this.vettoreClientiIscritti=vettoreClientiIscritti;
		this.numeroMassimoPosti=numeroMassimoPosti;
		this.costoMensile=costoMensile;
	}
	public abstract void acquisisciPuntiFrequentazioneCorso(int i);
	public double getCostoMensile() {
		return costoMensile;
	}
	public void setCostoMensile(double costoMensile) {
		this.costoMensile = costoMensile;
	}
	public int getNumeroMassimoPosti() {
		return numeroMassimoPosti;
	}
	public void setNumeroMassimoPosti(int numeroMassimoPosti) {
		this.numeroMassimoPosti = numeroMassimoPosti;
	}
	public Cliente[] getVettoreClientiIscritti() {
		return vettoreClientiIscritti;
	}
	public void setVettoreClientiIscritti(Cliente[] vettoreClientiIscritti) {
		this.vettoreClientiIscritti = vettoreClientiIscritti;
	}
	
	
}
