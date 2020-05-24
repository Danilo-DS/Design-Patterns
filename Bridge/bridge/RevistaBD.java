package bridge;

public class RevistaBD extends Revista {

	public RevistaBD() {}
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Titulo: Revista Teste.db";
	}

	@Override
	public String getID(int id) {
		// TODO Auto-generated method stub
		return "ID: " + id;
	}

	@Override
	public String getArtigo() {
		// TODO Auto-generated method stub
		return "Finge que tem um Artigo\n'~~~~~'";
	}

}
