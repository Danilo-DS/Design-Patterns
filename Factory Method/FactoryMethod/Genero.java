package FactoryMethod;

public class Genero {
	private String tipo;

	public Genero(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	public String Saudacao() {
		return "Não existe outro genero";
	}
}
