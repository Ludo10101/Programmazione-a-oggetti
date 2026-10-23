
public class Conto {
	
	private String iban;
	private Persona per;
	private double saldo=0;
	
	public Conto(String iban, Persona per) {
		this.iban=iban;
		this.per=per;
	}
	public boolean preleva(double val) {
		saldo=saldo-val;
		if(val<=0|| saldo-val<0) return false;
		else return true;
	}
	public boolean deposita(double val) {
		saldo=saldo+val;
		if(val<=0) return false;
		else return true;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Persona getPer() {
		return per;
	}
	public void setPer(Persona per) {
		this.per = per;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Nome: "+per.getNome()+" Cognome: "+ per.getCognome()+ " IBAN: " +iban+ " saldo: " +saldo;
	}

}
