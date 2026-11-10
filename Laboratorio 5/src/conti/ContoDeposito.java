package conti;

import java.util.ArrayList;


import Main.Accountable;
import Main.Conto;
import Main.Persona;
import eccezioni.PrelevaContoDepositoException;

public class ContoDeposito extends Conto{
	
	public ContoDeposito(String iban, Persona per, ArrayList<Accountable> arrayAccount) {
		super(iban, per, arrayAccount);
	}
	
	public void operazione(String causale, double soldi) {
		if(soldi<0) {
			throw new PrelevaContoDepositoException();
		}
		super.setSaldo(super.getSaldo()+soldi);
		System.out.println("[Causale]: "+ causale+ "\n[Importo operazione]: "+ soldi+ "\n[Saldo attuale]: "+super.getSaldo());
		
	}

}
