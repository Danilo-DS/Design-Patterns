package bridge;

public class LivroBD extends Livro{
	
	public LivroBD() {	}
	
	@Override
	public String getTitulo() {
		return "Titulo: LivroTeste.db";
	}

	@Override
	public String getID(int id) {
		// TODO Auto-generated method stub
		return "ID: " + id;
	}

	@Override
	public String getISBN() {
		// TODO Auto-generated method stub
		return "846468468416454";
	}
}
