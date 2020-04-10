package Builder;

public class EnchantedRoom extends AbstractRoom {
	protected AbstractMazeFactory montaCenario;
	
	public EnchantedRoom(AbstractMazeFactory MontaCenario) {
		this.montaCenario = MontaCenario;
	}
	public void montando() {
		montaCenario.makeMaze();
		montaCenario.makeWall();
		montaCenario.makeRoom();
		montaCenario.makeDoor();
	}
	public MazeGame getLabirinto() {
		return montaCenario.getMaze();
	}
}
