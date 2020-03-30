package modelAF;

public class MazeGame {
	
	private String tipo;
	
	
	public MazeGame() {}
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String createMaze() {
		EnchantedMazeFactory Encantado = new EnchantedMazeFactory();
		MazeFactory Comum = new MazeFactory();
		
		String Cenario = null;
		if (tipo.equals("encantado")) {
			Cenario = Encantado.makeMaze()+"\n" + Encantado.makeWall() +"\n"
					+ Encantado.makeRoom()+"\n" + Encantado.makeDoor();
		}
		else if (tipo.equals("comum")) {
			Cenario = Comum.makeMaze()+"\n" + Comum.makeWall() +"\n"
					+ Comum.makeRoom()+"\n" + Comum.makeDoor();
		}
		else {
			Cenario = "Existe apenas dois cenários";
		}
		return Cenario;
	}

	
}
