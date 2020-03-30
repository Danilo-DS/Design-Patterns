package modelAF;

public abstract class AbstractMazeFactory{
	
	private MazeGame Criar;
	
	public AbstractMazeFactory() {}
	
	public abstract String makeMaze();
	public abstract String makeWall();
	public abstract String makeRoom();
	public abstract String makeDoor();
}
