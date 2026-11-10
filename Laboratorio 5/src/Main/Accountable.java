package Main;

public class Accountable {
	private String nome;
	private Double saldo;
	
	public Accountable(String nome, double saldo) {
		this.nome=nome;
		this.saldo=saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
