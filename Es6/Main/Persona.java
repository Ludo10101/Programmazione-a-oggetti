package Main;
import Eccezioni.FailedLogInException;
import Eccezioni.DefaultPassException;
import Eccezioni.CredenzialiSbagliateException;


public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String password;
    private boolean flagAbbonamento;
    private boolean flagPassCambiata;
    private boolean flagLogIn;

    

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.password = "ChangeMe";
        this.flagAbbonamento = false;
        this.flagPassCambiata = false;
        this.flagLogIn = false;
    }
    public void cambiaPassword(String vecchiaPass, String nuovaPass){
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(this.password.equals(vecchiaPass)) {
            password=nuovaPass;
            flagPassCambiata=true;
        }else throw new CredenzialiSbagliateException("[ERRORE]\nLa password inserita: "+ vecchiaPass+"  risulta errata.\n",vecchiaPass);
    }
    public void logIn(String presuntaPass){
        if(presuntaPass.equals(password)) throw new CredenzialiSbagliateException("La password inserita: "+ presuntaPass+" risulta errata.\n");
        flagLogIn=true;
    }
    public void logOut(){
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        flagLogIn=false;
    }
    public void attivaAbbonamento(){
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        flagAbbonamento=true;
    }
    public void disdiciAbbonamento(){
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        flagAbbonamento=false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public String getPassword() {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        return password;
    }
    public void setPassword(String password) {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        this.password = password;
    }
    public boolean isFlagAbbonamento() {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        return flagAbbonamento;
    }
    public void setFlagAbbonamento(boolean flagAbbonamento) {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        this.flagAbbonamento = flagAbbonamento;
    }
    public boolean isFlagPassCambiata() {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        return flagPassCambiata;
    }
    public void setFlagPassCambiata(boolean flagPassCambiata) {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!this.flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        this.flagPassCambiata = flagPassCambiata;
    }
    public boolean isFlagLogIn() {
        if(!flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        return flagLogIn;
    }
    public void setFlagLogIn(boolean flagLogIn) {
        if(!this.flagLogIn) throw new FailedLogInException("Per accedere a questa funzione bisogna fare il Log In.\n");
        if(!flagPassCambiata) throw new DefaultPassException("Cambia la password di default prima di accedere a questa funzione.\n");
        this.flagLogIn = flagLogIn;
    }
    

}
