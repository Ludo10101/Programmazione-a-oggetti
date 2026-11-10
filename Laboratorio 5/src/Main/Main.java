package Main;
import java.util.ArrayList;
import conti.ContoWeb;
import eccezioni.PasswordVecchiaException;
import eccezioni.CredenzialiSbagliateException;
import eccezioni.NoLoggatoException;
import eccezioni.PrelevaContoDepositoException;
import eccezioni.NoAbbastanzaSoldiException;

public class Main {

	public static void main(String[] args) {
		
		// ISTANZIO UNA BANCA
		Banca bancaNovara=new Banca("Banca di Novara","BN",new ArrayList<Conto>());
		
		// INSERISCO 3 PERSONE NEL SISTEMA DELLA BANCA ASSOCIANDOGLI CONTO CORRENTE, DEPOSITO E WEB
		Persona per0=new Persona("Corrente", "cor","COR123");
		Persona per1=new Persona("Deposito", "dep","DEP123");
		Persona per2=new Persona("Web", "web","WEB123");
		
		bancaNovara.aggiungiContoCorrente(per0, new ArrayList<Accountable>());
		bancaNovara.aggiungiContoDeposito(per1, new ArrayList<Accountable>());
		bancaNovara.aggiungiContoWeb(per2, new ArrayList<Accountable>(),"UsrWeb");
		
		// FACCIO OPERAZIONI CON CONTO CORRENTE(Aggiungere accountable, arrivare a fine mese, rimuovere accountable, arrivare a fine mese, fare operazioni)
		bancaNovara.getArrayConti().get(0).operazione("Stipendio",20000.0);
		bancaNovara.getArrayConti().get(0).aggiungiAccountable(new Accountable("Netflix",20));
		bancaNovara.getArrayConti().get(0).fineMese();
		System.out.println(bancaNovara.getArrayConti().get(0).getSaldo());
		bancaNovara.getArrayConti().get(0).operazione("Tassa",-19980.0);
		try { 
			bancaNovara.getArrayConti().get(0).fineMese(); //PRELEVO TROPPI SOLDI
		}catch(NoAbbastanzaSoldiException e) {
			System.out.println("[ERRORE]:\n"+e.getMessage());
		}
		
		bancaNovara.getArrayConti().get(0).rimuoviAccountable(0);
		bancaNovara.getArrayConti().get(0).fineMese();
		System.out.println(bancaNovara.getArrayConti().get(0).getSaldo());
		
		//FACCIO OPERAZIONI CON CONTO DEPOSITO(Operazione non valida)
		try {
			bancaNovara.getArrayConti().get(1).operazione("OperazioneNonValida", -200); // PRELEVO DA UN CONTO DEPOSITO
		}catch(PrelevaContoDepositoException e) {
			System.out.println("[ERRORE]:\n"+e.getMessage());
		}
		// FACCIO OPERAZIONI CON CONTO WEB
		ContoWeb cnt = ((ContoWeb)bancaNovara.getArrayConti().get(2));
		cnt.logIn("UsrWeb","ChangeMe");
		try {
			cnt.operazione("Stipendio", 20);
		}catch(PasswordVecchiaException e) {			// ESEGUO UN'OPERAZIONE SENZA CAMBIARE LA PASSWORD
			System.out.println("[ERRORE]:\n"+e.getMessage());
		}
		try{
			cnt.cambiaPassword( "ChangeMe", "NuovaPass123");
		}catch(CredenzialiSbagliateException e) {					// SBAGLIO LE CREDENZIALI PER IL LOG IN 
			System.out.println("[ERRORE]:\n"+e.getMessage());
		}
		cnt.operazione("Stipendio", 21000);
		System.out.println("Password: "+cnt.getPassword());
		bancaNovara.getArrayConti().get(2).operazione("Ciao", -2000);
		cnt.logOut();
		try {
			cnt.cambiaPassword( "NuovaPass123","NuovaPass456" ); //NON PUOI CAMBIARE LA PASSWORD SE NON SEI LOGGATO
		}catch(NoLoggatoException e) {
			System.out.println("[ERRORE]:\n"+e.getMessage());
		}
		
			
	}

}
