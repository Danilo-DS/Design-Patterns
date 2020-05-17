package bridge;

public class LivroXML extends Livro implements Publicacao{
	private int id;

	public LivroXML(int id) {
		this.id = id;
	}
	
	public LivroXML() {	}
	
	@Override
	public String getTitulo() {
		return "Livro XML";
	}

	@Override
	public int getAutor(int id) {
		return id;
	}

	@Override
	public String getISBN() {
		return ("Id_Autor: "+ getAutor(id) +" Tipo de Livro: "+ getTitulo());
	}
}
