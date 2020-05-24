package bridge;

public class Publicacao {
	private Livro livro;
	private Revista revista;
	
	public Publicacao(){
	}
	
	public void PublicarLivro(Livro l, int id) {
		this.livro = l;
		System.out.println(livro.getID(id));
		System.out.println(livro.getTitulo());
		System.out.println(livro.getISBN());
	}
	
	public void PublicarRevista(Revista r, int id) {
		this.revista = r;
		System.out.println(revista.getID(id));
		System.out.println(revista.getTitulo());
		System.out.println(revista.getArtigo());
	}
}
