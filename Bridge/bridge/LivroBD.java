package bridge;

public class LivroBD extends Livro implements Publicacao{
	
	private int id; 
	
	public LivroBD(int id) {
		this.id = id;
	}
	
	public LivroBD() {}
	
	@Override
	public String getTitulo() {
		return "Livro Banco de Dados";
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
