package modelAF;

public class MazeFactory extends AbstractMazeFactory{
	
	@Override
	public String makeMaze() {
		getInstace();
		return "Criando labirinto";
	}

	@Override
	public String makeWall() {
		return "Criando Paredes do Labirinto";
	}

	@Override
	public String makeRoom() {
		return "Criando Quarto";
	}

	@Override
	public String makeDoor() {
		return "Crinado Porta";
	}
	
	public Room getInstace() {
		return new Room();
	}

}
