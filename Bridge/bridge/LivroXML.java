package bridge;

public class LivroXML extends Livro{
	

	public LivroXML() {	}
	
	@Override
	public String getTitulo() {
		return "Titulo: LivroTeste.xml";
	}

	@Override
	public String getID(int id) {
		// TODO Auto-generated method stub
		return "ID: " + id;
	}

	@Override
	public String getISBN() {
		// TODO Auto-generated method stub
		return "ISBN: 84354234869889";
	}

}
