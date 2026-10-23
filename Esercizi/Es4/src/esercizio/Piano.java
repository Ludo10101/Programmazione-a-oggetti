package esercizio;

public class Piano {
	private postoAuto[] vettPosti;
	private int num=0;
	private int max;
	
	public Piano(int num) {
		this.num=num;
		vettPosti=new postoAuto[max];
	}
	public void aggiungiPostoAuto(postoAuto p) {
		if(num<max) {
			vettPosti[num]=p;
			num++;
		}else {
			System.out.println("Il numero di posti Auto nel piano è massimo");
		}
	}
	// SE LA RICERCA NON E' ANDATA A BUON FINE RESTITUISCO -1
	public int trovaPostoDisponibile() {
		for(int i=0;i<vettPosti.length;i++) {
			if(vettPosti[i].getVei()==null) {
				return i;
			}
		}
		return -1;
	}

	public postoAuto[] getVettPosti() {
		return vettPosti;
	}

	public void setVettPosti(postoAuto[] vettPosti) {
		this.vettPosti = vettPosti;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	

}
