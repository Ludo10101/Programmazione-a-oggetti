package conti;

import java.util.ArrayList;

import Main.Accountable;
import Main.Persona;
import Main.Conto;
import eccezioni.NoAbbastanzaSoldiException;
import eccezioni.NoLoggatoException;
import eccezioni.PasswordVecchiaException;
import eccezioni.CredenzialiSbagliateException;

public class ContoWeb extends Conto{
	
	private String username;
	private String password;
	private boolean loggedIn;
	private boolean passwordCambiata;
	

	public ContoWeb(String iban, Persona per, ArrayList<Accountable> arrayAccount, String username) {
		super(iban, per, arrayAccount);
		this.username=username;
		password="ChangeMe";
	}
	public void logIn(String username, String password) {
		if(!(this.username.equals(username) && this.password.equals(password))) {
			loggedIn=false;
			throw new CredenzialiSbagliateException();	
		}
		loggedIn=true;
	}
	
	public void logOut() {
		if(!loggedIn) throw new NoLoggatoException();
		loggedIn=false;
	}
	
	public void passwordAggiornata() {
		if(password.equals("ChangeMe")) passwordCambiata=false;
		else passwordCambiata=true;
	}
	
	public void cambiaPassword(String passAttualeInserita, String nuovaPass) {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passAttualeInserita.equals(password)) throw new CredenzialiSbagliateException();
		password=nuovaPass;
		passwordAggiornata();
	}
	
	@Override
	public void operazione(String causale, double soldi) {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		if(super.getSaldo()<-soldi) throw new NoAbbastanzaSoldiException(causale, soldi, super.getSaldo());
		super.setSaldo(super.getSaldo()+soldi);
		System.out.println("[Username]: "+username+ "\n[Causale]: "+ causale+ "\n[Importo operazione]: "+ soldi+ "\n[Saldo attuale]: "+super.getSaldo());
	}
	
	// ORA FACCIO L'OVERRIDE DEI METODI DI CONTO PERCHE' NON DEVONO ESSERE ACCESSIBILI NEANCHE QUELLI SE NON SI È LOGGATI O SE NON SI È CAMBIATI LA PASSWORD DI DEFAULT
	
	@Override
	public void aggiungiAccountable(Accountable acnt) {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		super.aggiungiAccountable(acnt);
	}
	
	@Override
	public void rimuoviAccountable(int index) {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		super.rimuoviAccountable(index);
	}
	
	@Override
	public void stampaDettagli() {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		super.stampaDettagli();
	}
	
	@Override
	public void fineMese() {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		super.fineMese();
	}
	
	
	public String getUsername() {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		return username;
	}
	public void setUsername(String username) {
		if(!loggedIn) throw new NoLoggatoException();
		if(!passwordCambiata) throw new PasswordVecchiaException();
		this.username = username;
	}
	public String getPassword() {
		if(!loggedIn) throw new NoLoggatoException();
		return password;
	}
	public void setPassword(String password) {
		if(!loggedIn) throw new NoLoggatoException();
		this.password = password;
		passwordCambiata=true;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		if(!loggedIn) throw new NoLoggatoException();
		this.loggedIn = loggedIn;
	}
	public boolean isPasswordCambiata() {
		if(!loggedIn) throw new NoLoggatoException();
		return passwordCambiata;
	}
	public void setPasswordCambiata(boolean passwordCambiata) {
		if(!loggedIn) throw new NoLoggatoException();
		this.passwordCambiata = passwordCambiata;
	}
}
