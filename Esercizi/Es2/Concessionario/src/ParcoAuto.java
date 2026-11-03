

public class ParcoAuto {

        private Veicolo[] flotta;
        private int numeroVeicoli=0;
        private int capacita;
        
        public ParcoAuto(int cap) {
        	flotta=new Veicolo[cap];
        	capacita=cap;
        }
        
        public boolean aggiungiVeicolo(Veicolo macchina) {
        	if(numeroVeicoli<capacita) {
        		for(int i=0;i<numeroVeicoli;i++) {
        			if(flotta[i].getTarga().equals(macchina.getTarga())) {
        			return false;
        			}
        		
        		}
        		flotta[numeroVeicoli]=macchina;
        		numeroVeicoli++;
        		return true;
        	}
        	return false;
        }
        
        public Veicolo cercaPerTarga(String tar) {
        	for(int i=0;i<numeroVeicoli;i++) {
        		if(flotta[i].getTarga().equals(tar)) {
        			return flotta[i];
        		}
        	}
         return null;
        }
        public boolean noleggiaVeicolo(String tar) {
        	if(cercaPerTarga(tar)!=null) {
        		if(!(cercaPerTarga(tar).getNoleggiato())) {
        			cercaPerTarga(tar).noleggia();
            		return true;
        		}		
        	}
        	return false;
        }
        
        public double calcolaPrezzoMedioDisponibili() {
        	double somma=0;
        	int j=0;
        	for(int i=0; i<numeroVeicoli;i++) {
        		if(!(flotta[i].getNoleggiato())) {
        			somma=somma+flotta[i].getPrezzoGiornaliero();
        			j++;
        		}
        	}
        	if(j==0) {
        		return somma;
        	}
        	return somma/j;
        }
        public void stampaVeicoliDisponibili() {
        	for(int i=0;i<numeroVeicoli;i++) {
        		if(!flotta[i].getNoleggiato()) {
        			System.out.println(flotta[i].getModello());
        		}
        	}
        }
        
    
        public Veicolo[] filtraPerMarca(String mar) {
        	int count=0;
        	for(int i=0;i<numeroVeicoli;i++) {
        		if(flotta[i].getMarca().equals(mar)) {
        			count++;
        		}
        	}
        	Veicolo[] arrayFiltrato=new Veicolo[count];
        	int j=0;
        	for(int i=0;i<numeroVeicoli;i++) {
        		if(flotta[i].getMarca().equals(mar)) {
        			arrayFiltrato[j]=flotta[i];
        			j++;
        		}
        	}
        	return arrayFiltrato;
        }
      
}
