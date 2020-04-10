package application;

import java.util.Scanner;

import Builder.*;

public class Principal {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
		MazeGame maze = new MazeGame();
		System.out.println(maze.createMaze(sc.next()));
		
		sc.close();
	}
}
