package Main;
import java.util.ArrayList;
import conti.ContoWeb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			bancaNovara.getArrayConti().get(0).deposita(20000.0);
			bancaNovara.getArrayConti().get(0).aggiungiAccountable(new Accountable("Netflix",20));
			bancaNovara.getArrayConti().get(0).fineMese();
			System.out.println(bancaNovara.getArrayConti().get(0).getSaldo());
			bancaNovara.getArrayConti().get(0).rimuoviAccount(0);
			bancaNovara.getArrayConti().get(0).fineMese();
			System.out.println(bancaNovara.getArrayConti().get(0).getSaldo());
			bancaNovara.getArrayConti().get(0).operazione("Stipendio",2000);
			
			//FACCIO OPERAZIONI CON CONTO DEPOSITO(Operazione non valida)
			//bancaNovara.getArrayConti().get(1).operazione("OperazioneNonValida", -200);
			
			// FACCIO OPERAZIONI CON CONTO WEB
			ContoWeb cnt = ((ContoWeb)bancaNovara.getArrayConti().get(2));
			cnt.logIn("UsrWeb","ChangeMe");
			cnt.cambiaPassword( "ChangeMe", "NuovaPass123");
			cnt.operazione("Stipendio", 21000);
			System.out.println("Password: "+cnt.getPassword());
			bancaNovara.getArrayConti().get(2).operazione("Ciao", -2000);
			cnt.logOut();
			//cnt.cambiaPassword( "NuovaPass123","NuovaPass456" ); NON PUOI CAMBIARE LA PASSWORD SE NON SEI LOGGATO
			
	}

}
