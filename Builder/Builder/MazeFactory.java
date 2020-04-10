package Builder;

public class MazeFactory extends AbstractMazeFactory {

	void makeMaze() {
		maze.setMaze("Labirinto Criado");
	}

	void makeWall() {
		maze.setWall("Parede Criada");
	}

	void makeRoom() {
		maze.setRoom("Quarto Criando");
	}

	void makeDoor() {
		maze.setDoor("Porta Criada");
	}
	public MazeGame getInstece() {
		Room room = new Room(new MazeFactory());
		room.montando();
		return room.getLabirinto();
	}
}
