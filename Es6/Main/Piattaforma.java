package Main;
import java.util.ArrayList;

public class Piattaforma {
    private String nome;
    private String sigla;
    private ArrayList<Account> arrayAccount;
    private ArrayList<Contenuto> arrayContenuto;

    public void aggiungiAccount(Account acc){
        arrayAccount.add(acc);
    }
    public void rimuoviAccount(Account acc){
        arrayAccount.remove(acc);
    }
    public void aggiungiContenuto(Contenuto acc){
        arrayContenuto.add(acc);
    }
    public void rimuoviContenuto(Contenuto acc){
        arrayContenuto.remove(acc);
    }


    
    public Piattaforma(String nome, String sigla, ArrayList<Account> arrayAccount,
            ArrayList<Contenuto> arrayContenuto) {
        this.nome = nome;
        this.sigla = sigla;
        this.arrayAccount = arrayAccount;
        this.arrayContenuto = arrayContenuto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public ArrayList<Account> getArrayAccount() {
        return arrayAccount;
    }
    public void setArrayAccount(ArrayList<Account> arrayAccount) {
        this.arrayAccount = arrayAccount;
    }
    public ArrayList<Contenuto> getArrayContenuto() {
        return arrayContenuto;
    }
    public void setArrayContenuto(ArrayList<Contenuto> arrayContenuto) {
        this.arrayContenuto = arrayContenuto;
    }

    
    
}
