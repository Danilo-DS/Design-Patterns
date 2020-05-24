package bridge;



public class RevistaXML extends Revista{
	
	public RevistaXML() {}
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return "Titulo: Revista Teste.xml";
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
