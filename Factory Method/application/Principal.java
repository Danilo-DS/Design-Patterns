package application;

import java.util.Scanner;

import FactoryMethod.FactoryPessoa;
import FactoryMethod.Genero;
import FactoryMethod.Homem;
import singleton.CadastroP;

public class Principal {

    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	
		FactoryPessoa fp = new FactoryPessoa();
		Genero g = fp.getGenero("M", "Danilo");
		
		System.out.println(g.Saudacao());
 
    	sc.close();
	}
}
