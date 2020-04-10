package Polimofismo;

public class AlunoUniversitario extends Aluno {
	
	private String curso;
	
	
	public AlunoUniversitario(String nome, String matricula, String curso) {
		super(nome, matricula);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String InfoAluno() {
		return "Meu nome "+getNome()+", minha Matricula "+getMatricula()
				+", sou do curso "+this.curso+" universitário(a).";
	}
	
}
