package FactoryMethod;

public class FactoryPessoa {

	
	public FactoryPessoa() {}
	
	public Genero getGenero(String tipo, String nome) {
		if (tipo.equals("M")) {
			Homem h = new Homem("Bem Vindo");
			h.setNome(nome);
			return h;
		}
		else if (tipo.equals("F")){
			return new Mulher("Bem vinda","");
		}else{
			return new Genero("");
		}
		
	}
}
