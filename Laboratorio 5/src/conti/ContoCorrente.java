package conti;

import java.util.ArrayList;

import Main.Accountable;
import Main.Conto;
import Main.Persona;
import eccezioni.NoAbbastanzaSoldiException;

public class ContoCorrente extends Conto{
	
	public ContoCorrente(String iban, Persona per, ArrayList<Accountable> arrayAccount) {
		super(iban, per, arrayAccount);
	}
	
	public void operazione(String causale, double soldi) {
		if(super.getSaldo()<-soldi) {
			throw new NoAbbastanzaSoldiException(causale, soldi, super.getSaldo());
		}
		super.setSaldo(super.getSaldo()+soldi);
		System.out.println("[Causale]: "+ causale+ "\n[Importo operazione]: "+ soldi+ "\n[Saldo attuale]: "+super.getSaldo());
		
	}
}
