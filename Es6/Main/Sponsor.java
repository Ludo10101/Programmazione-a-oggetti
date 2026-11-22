package Main;
public class Sponsor {
    private int id;
    private String nome;
    private double ricavoPerStream;
    
    public Sponsor(int id, String nome, double ricavoPerStream) {
        this.id = id;
        this.nome = nome;
        this.ricavoPerStream = ricavoPerStream;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRicavoPerStream() {
        return ricavoPerStream;
    }
    public void setRicavoPerStream(double ricavoPerStream) {
        this.ricavoPerStream = ricavoPerStream;
    }
    
}
