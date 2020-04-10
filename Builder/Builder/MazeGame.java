package Builder;

public class MazeGame {
	
	private String Maze;
	private String Wall;
	private String Room;
	private String Door;
	
	public MazeGame(String maze, String wall, String room, String door) {
		this.Maze = maze;
		this.Wall = wall;
		this.Room = room;
		this.Door = door;
	}
	
	public MazeGame() {
	}

	public String getMaze() {
		return Maze;
	}

	public void setMaze(String maze) {
		Maze = maze;
	}

	public String getWall() {
		return Wall;
	}

	public void setWall(String wall) {
		Wall = wall;
	}

	public String getRoom() {
		return Room;
	}

	public void setRoom(String room) {
		Room = room;
	}

	public String getDoor() {
		return Door;
	}

	public void setDoor(String door) {
		Door = door;
	}
	
	public String createMaze(String tipo) {
		String Cenario = "";
		MazeGame mazeGame;
		
		if (tipo.equals("encantado")) {
			EnchantedMazeFactory enchanted = new EnchantedMazeFactory();
			mazeGame = enchanted.getInstace();
			Cenario = mazeGame.getMaze() + "\n" + mazeGame.getWall() + "\n" + mazeGame.getRoom() + "\n" + mazeGame.getDoor(); 
		}
		else if (tipo.equals("comum")) {
			MazeFactory mazeFactory = new MazeFactory();
			mazeGame = mazeFactory.getInstece();
			Cenario = mazeGame.getMaze() + "\n" + mazeGame.getWall() + "\n" + mazeGame.getRoom() + "\n" + mazeGame.getDoor();
		}
		else {
			Cenario = "Não existe esse cenário";
		}
		return Cenario;
	}
}
