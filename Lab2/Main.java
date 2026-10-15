

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona per0=new Persona("Ludo", "Silve","ABC123");
		Conto conto0= new Conto("ITciao",per0);
		
		// Verifico se i metodi scritti sono corretti:
		conto0.setSaldo(200);
		boolean ris;
		// Deposito in maniera corretta:
		ris=conto0.deposita(10);
		System.out.println("L'operazione è andata: "+ris);
		// Prelevo in maniera corretta:
		ris=conto0.preleva(10);
		System.out.println("L'operazione è andata: "+ris);
		// Deposito in maniera errata:
		ris=conto0.deposita(-10);
		System.out.println("L'operazione è andata: "+ris);
		// Prelevo in maniera errata 1 (prelevo una quantità negativa):
		ris=conto0.preleva(-10);
		System.out.println("L'operazione è andata: "+ris);
		// Prelevo in maniera errata 2 (prelevo più di quanto ho sul saldo):
		ris=conto0.preleva(-500);
		System.out.println("L'operazione è andata: "+ris);
		
		// TESTARE LA CLASSE BANCA:
		/*
		 *•creare una banca con 10 conti
		•aggiungere qualche conto
		•fare operazioni sui conti
		•stampare saldo totale
		•stampare elenco conti 
		 * 
		 * 
		 * 
		 * */
		
		//Creare una banca con 10 conti
		Banca bank=new Banca("Banca di Novara",10);
		bank.setRadiceIban("IT");

		Persona	per1=new Persona("Gaetano", "Bonaventura", "32987");
 		Persona per2=new Persona("Odul", "Evlis","321CBA");
		Persona per3=new Persona("Zina", "Evlis","111CBA");
		Persona per4=new Persona("Adri", "Evlis","222CBA");
		Persona per5=new Persona("Enzo", "Evlis","333CBA");
		Persona per6=new Persona("Rosaria", "Evlis","444CBA");
		Persona per7=new Persona("Francesco", "Evlis","555CBA");
		
		bank.aggiungiConto("aaaa", per1);
		bank.aggiungiConto("bbbb", per2);
		bank.aggiungiConto("cccc", per3);
		bank.aggiungiConto("dddd", per4);
		bank.aggiungiConto("eeee", per5);
		bank.aggiungiConto("ffff", per6);
		bank.aggiungiConto("gggg", per7);
		
		// Fare operazioni con i conti:
		
		//1. cercare un conto dall'iban:
		String stringa=bank.getRadiceIban()+"cccc";
		System.out.println("Il conto con l'iban: " +stringa + " è di: "+bank.getConto(stringa).getPer().getNome());
		
		//2. fare operazioni
		
		bank.getConto(stringa).setSaldo(200);
		bank.operazione(200, bank.getConto(stringa));
		System.out.println("il conto ha il seguente saldo: " + bank.getConto(stringa).getSaldo());
		bank.operazione(-2000, bank.getConto(stringa));
		System.out.println("il conto ha il seguente saldo: " + bank.getConto(stringa).getSaldo());
		
		// stampare il saldo totale:
		System.out.println("Il saldo totale è: " + bank.totaleSaldi());
		
		// Stampare elenco conti:
		System.out.println("ELENCO CONTI:");
		for(int i=0;i<bank.getNumeroContiAttivi();i++) {
			System.out.println(bank.getIesimoConto(i));
		}
		
	}

}
