package FactoryMethod;

public class Mulher extends Genero{
	private String nome;

	public Mulher(String tipo,String nome) {
		super(tipo);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String Saudacao() {
		return getTipo() + " Sra: " + this.nome;
	}
}
