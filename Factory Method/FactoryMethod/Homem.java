package FactoryMethod;

public class Homem extends Genero{
	public String nome;
	
	public Homem(String tipo) {
		super(tipo);
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String Saudacao() {
		return getTipo() + " Sr: "+this.getNome();
	}
}
