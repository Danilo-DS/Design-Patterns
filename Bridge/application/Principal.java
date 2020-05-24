package application;

import bridge.LivroBD;
import bridge.Publicacao;
import bridge.RevistaXML;


public class Principal {

    public static void main(String[] args) {
    	 
    	Publicacao p = new Publicacao();
    	p.PublicarLivro(new LivroBD(), 5);
    	System.out.println();
    	p.PublicarRevista(new RevistaXML(), 10);
	}
}
