package Builder;

public class Room extends AbstractRoom {
	protected AbstractMazeFactory montaCenario;
	public Room(AbstractMazeFactory MontaCenario) {
		this.montaCenario = MontaCenario;
	}
	public void montando(){
		montaCenario.makeMaze();
		montaCenario.makeWall();
		montaCenario.makeRoom();
		montaCenario.makeDoor();
	}
	public MazeGame getLabirinto() {
		return montaCenario.getMaze();
	}
	
}
