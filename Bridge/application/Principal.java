package application;

import bridge.Livro;
import bridge.LivroBD;
import bridge.LivroXML;
import bridge.Revista;
import bridge.RevistaBD;
import bridge.RevistaXML;

public class Principal {

    public static void main(String[] args) {
    	 
    	Livro l = new LivroBD(15);
    	System.out.println(l.getISBN());
    	
    	System.out.println();
    	
    	Livro l2 = new LivroXML(10);
    	System.out.println(l2.getISBN());
    	
    	System.out.println();
    	
    	Revista r = new RevistaBD(20);
    	System.out.println(r.getArtigo());
    	
    	System.out.println();
    	
    	Revista r2 = new RevistaXML(5);
    	System.out.println(r2.getArtigo());
	}
}
