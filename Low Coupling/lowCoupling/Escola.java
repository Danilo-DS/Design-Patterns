package lowCoupling;

public class Escola {
	private Aluno vaiDe;
	
	public Escola (){};
	
	public Aluno getVaiDe() {
		return vaiDe;
	}
	
	public void setVaiDe(Aluno c) {
		this.vaiDe = c;
	}
	
	public void Indo() {
		System.out.print("Hoje ");
		vaiDe.De();
	}
}
