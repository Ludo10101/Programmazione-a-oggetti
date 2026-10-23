package esercizio;

public class postoAuto {
	private double requisitiLunghezza;
	private double requisitiLarghezza;
	private double requisitiAltezza;
	private Veicolo vei=null;
	
	public postoAuto(double requisitiLunghezza, double requisitiLarghezza, double requisitiAltezza) {
		this.requisitiLunghezza = requisitiLunghezza;
		this.requisitiLarghezza = requisitiLarghezza;
		this.requisitiAltezza = requisitiAltezza;
	}
	
	public boolean verificaAccesso(Veicolo v) {
		if(v.getLunghezza()<=requisitiLunghezza&&v.getLarghezza()<=requisitiLarghezza&&v.getAltezza()<=requisitiAltezza) {
			return true;
		}
		return false;
	}
	

	public double getRequisitiLunghezza() {
		return requisitiLunghezza;
	}

	public void setRequisitiLunghezza(double requisitiLunghezza) {
		this.requisitiLunghezza = requisitiLunghezza;
	}

	public double getRequisitiLarghezza() {
		return requisitiLarghezza;
	}

	public void setRequisitiLarghezza(double requisitiLarghezza) {
		this.requisitiLarghezza = requisitiLarghezza;
	}

	public double getRequisitiAltezza() {
		return requisitiAltezza;
	}

	public void setRequisitiAltezza(double requisitiAltezza) {
		this.requisitiAltezza = requisitiAltezza;
	}

	public Veicolo getVei() {
		return vei;
	}

	public void setVei(Veicolo vei) {
		this.vei = vei;
	}
	
	
	
}
