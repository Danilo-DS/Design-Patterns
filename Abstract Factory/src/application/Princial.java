package application;

import modelAF.MazeGame;

public class Princial {
	
	public static void main(String[] args) {
		MazeGame mg = new MazeGame();
		mg.setTipo("encantado");
		
		System.out.println(mg.createMaze() + "\n");
		
		MazeGame mg2 = new MazeGame();
		mg2.setTipo("comum");
		
		System.out.println(mg2.createMaze());
	}
}
