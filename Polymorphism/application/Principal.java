package application;

import Polimofismo.Aluno;
import Polimofismo.AlunoUniversitario;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("Danilo", "20191007029");
		System.out.println(a.InfoAluno());
		
		Aluno a2 = new AlunoUniversitario("Alana","20171005872","Sistemas para Internet");
		System.out.println(a2.InfoAluno());
	}
}
