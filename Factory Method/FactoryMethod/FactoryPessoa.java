package FactoryMethod;

public class FactoryPessoa {
	
	public FactoryPessoa() {}
	
	public Genero getGenero(String tipo) {
		if (tipo.equals("M")) {
			return new Homem("Bem vindo",null);
		}
		else if (tipo.equals("F")){
			return new Mulher("Bem vindo",null);
		}else{
			return new Genero("");
		}
		
	}
}
