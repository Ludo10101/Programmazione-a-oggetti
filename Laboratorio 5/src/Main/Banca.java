package Main;
import conti.ContoCorrente;
import conti.ContoDeposito;
import conti.ContoWeb;

import java.util.ArrayList;
public class Banca {
	private String nome;
	private String radiceIban;
	private ArrayList<Conto> arrayConti;

	
	public Banca(String nome, String radiceIban, ArrayList<Conto> arrayConti ) {
		this.nome=nome;
		this.radiceIban=radiceIban;
		this.arrayConti=arrayConti;
	}
	
	public String generaIban(Persona per) {
		return this.radiceIban+per.getCf();
	}
	//Voglio che il conto sia legato alla banca, cioè ogni conto di una stessa banca deve avere la stessa radice di iban
	public void aggiungiContoCorrente (Persona per, ArrayList<Accountable> accounts) {
		Conto cnt=new ContoCorrente(generaIban(per),per, accounts);
		arrayConti.add(cnt);
	}
	public void aggiungiContoDeposito(Persona per, ArrayList<Accountable> accounts) {
		Conto cnt=new ContoDeposito(generaIban(per),per, accounts);
		arrayConti.add(cnt);
	}
	public void aggiungiContoWeb(Persona per, ArrayList<Accountable> accounts, String username) {
		Conto cnt=new ContoWeb(generaIban(per),per, accounts,username);
		arrayConti.add(cnt);
	}
	public void eliminaConto(int indice) {
		arrayConti.remove(indice);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRadiceIban() {
		return radiceIban;
	}

	public void setRadiceIban(String radiceIban) {
		this.radiceIban = radiceIban;
	}

	public ArrayList<Conto> getArrayConti() {
		return arrayConti;
	}

	public void setArrayConti(ArrayList<Conto> arrayConti) {
		this.arrayConti = arrayConti;
	}

}