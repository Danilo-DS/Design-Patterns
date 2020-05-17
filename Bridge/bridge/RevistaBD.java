package bridge;

public class RevistaBD extends Revista implements Publicacao{
	
	private int id;
	
	public RevistaBD(int id) {
		this.id = id;
	}
	
	public RevistaBD() {}
	
	@Override
	public String getTitulo() {
		return "Revista BD";
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
