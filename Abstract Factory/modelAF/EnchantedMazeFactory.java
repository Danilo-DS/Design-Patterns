package modelAF;



public class EnchantedMazeFactory extends AbstractMazeFactory{

	public EnchantedMazeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String makeMaze() {
		getInstace();
		return "Criando labirinto Encantado";
	}

	@Override
	public String makeWall() {
		return "Criando Paredes do Labirinto Encantado";
	}

	@Override
	public String makeRoom() {
		return "Criando quarto Encantado ";
	}

	@Override
	public String makeDoor() {
		return "Crinado Porta Encantada";
	}
	
	public EnchantedRoom getInstace() {
		return new EnchantedRoom();
	}
}
