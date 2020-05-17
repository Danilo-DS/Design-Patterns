package bridge;

public class RevistaXML extends Revista implements Publicacao{
	
	private int id;
	
	public RevistaXML(int id) {
		this.id = id;
	}
	
	public RevistaXML() {}
	
	@Override
	public String getTitulo() {
		return "Revista XML";
	}

	@Override
	public int getAutor(int id) {
		return id;
	}

	@Override
	public String getArtigo() {
		return ("Id_Autor: "+ getAutor(id) + " Tipo de Livro: " + getTitulo());
	}
}
