package Builder;

public abstract class AbstractMazeFactory {
	
	public MazeGame maze;
	
	public AbstractMazeFactory(){
		this.maze = new MazeGame();
	}
	
	abstract void makeMaze();
	abstract void makeWall();
	abstract void makeRoom();
	abstract void makeDoor();
	
	public MazeGame getMaze() {
		return maze;
	}
}
