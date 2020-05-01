package singleton;

public class CadastroP {
	private static CadastroP pessoa;
	
	private String nome;
	private String idade;
	
	private CadastroP() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public static CadastroP getInstance() {
		pessoa = new CadastroP();
		return pessoa;
	}
	
	public void ShowInfo() {
		System.out.println(getNome() + " " + getNome().length());
	}
}
