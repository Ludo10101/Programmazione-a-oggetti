package Main;

import java.util.ArrayList;

import eccezioni.NoAbbastanzaSoldiException;
public abstract class Conto {
	
	protected String iban;
	protected Persona per;
	protected double saldo=0;
	private ArrayList<Accountable> arrayAccount;
	
	public Conto(String iban, Persona per, ArrayList<Accountable> arrayAccount) {
		this.iban=iban;
		this.per=per;
		this.arrayAccount=arrayAccount;
	}

	public void aggiungiAccountable(Accountable acnt) {
		arrayAccount.add(acnt);
	}
	public void rimuoviAccountable(int index) {
		arrayAccount.remove(index);
	}
	
	public void stampaDettagli() {
		System.out.println("IBAN: "+ iban+ " Nome: " + per.getNome()+ " Cognome: "+per.getCognome()+ " Codice Fiscale " +per.getCf());
		for(Accountable arr : arrayAccount) {
			System.out.println("Nome: "+arr.getNome()+" Saldo: "+ arr.getSaldo() );
		}
	}
	
	public void fineMese() {
		for(Accountable arr : arrayAccount) {
			if(saldo<arr.getSaldo()) {
				throw new NoAbbastanzaSoldiException(arr.getNome(),arr.getSaldo(),saldo); 
			}
			saldo=saldo-arr.getSaldo();
		}
	}
	
	public abstract void operazione(String causale, double importo) throws NoAbbastanzaSoldiException;
	
	
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
	public ArrayList<Accountable> getArrayAccount() {
		return arrayAccount;
	}
	public void setArrayAccount(ArrayList<Accountable> arrayAccount) {
		this.arrayAccount = arrayAccount;
	}
}
