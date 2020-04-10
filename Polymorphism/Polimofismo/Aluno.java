package Polimofismo;

public class Aluno {
	private String nome;
	private String Matricula;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		Matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public String InfoAluno() {
		return "Meu nome "+this.nome+", minha Matricula "
				+this.Matricula+" sou um aluno.";
	}
}
