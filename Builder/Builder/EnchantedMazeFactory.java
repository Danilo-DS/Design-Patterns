package Builder;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	void makeMaze() {
		maze.setMaze("Labirinto Encantado Criado");
	}

	void makeWall() {
		maze.setWall("Parede Encantada Criada");
	}

	void makeRoom() {
		maze.setRoom("Quarto Encantado Criado");
	}

	void makeDoor() {
		maze.setDoor("Porta Encantada Criada");
	}
	
	public MazeGame getInstace() {
		EnchantedRoom enchanted = new EnchantedRoom(new EnchantedMazeFactory());
		enchanted.montando();
		return enchanted.getLabirinto();
	}
}
