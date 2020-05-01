package application;

import java.util.Scanner;

import prototype.Rectagle;
import prototype.Shape;
import prototype.ShapeCache;


public class Principal {

    public static void main(String[] args) {
    	    	
    	ShapeCache sc = new ShapeCache();
    	System.out.println(sc.getShape("R", "1"));
	}
}
