
public class Banca {
	private String nome;
	private int numeroContiMax;
	private Conto[] arrayConti;
	private int numeroContiAttivi=0;
	private String radiceIban;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroContiMax() {
		return numeroContiMax;
	}
	public void setNumeroContiMax(int numeroContiMax) {
		this.numeroContiMax = numeroContiMax;
	}
	public Conto[] getArrayConti() {
		return arrayConti;
	}
	public void setArrayConti(Conto[] arrayConti) {
		this.arrayConti = arrayConti;
	}
	public int getNumeroContiAttivi() {
		return numeroContiAttivi;
	}
	public void setNumeroContiAttivi(int numeroContiAttivi) {
		this.numeroContiAttivi = numeroContiAttivi;
	}
	public String getRadiceIban() {
		return radiceIban;
	}
	public void setRadiceIban(String radiceIban) {
		this.radiceIban = radiceIban;
	}
	
	public Banca(String nome, int numeroContiMax) {
		this.nome=nome;
		this.numeroContiMax=numeroContiMax;
		arrayConti= new Conto[numeroContiMax];
	}

	
	public Conto aggiungiConto(String iban, Persona per) {
		if(numeroContiAttivi>=numeroContiMax) {
			return null;
		}
		arrayConti[numeroContiAttivi]= new Conto(radiceIban+iban, per);
		numeroContiAttivi++;
		return arrayConti[numeroContiAttivi];
	}
	public double totaleSaldi() {
		double somma=0;
		for(int i=0;i<numeroContiAttivi;i++) {
			somma=somma+arrayConti[i].getSaldo();
		}
		return somma;
	}
	public void operazione(double val, Conto conto1) {
		if(val>=0) conto1.deposita(val);
		else conto1.preleva(-val);			
	}
	public Conto getConto(String iba) {
		for(int i=0;i<arrayConti.length;i++) {
			if(arrayConti[i].getIban().equals(iba)) return arrayConti[i] ;
		}
		return null;
	}
	public Conto getIesimoConto(int i) {
		return arrayConti[i];
	}
	
	

}