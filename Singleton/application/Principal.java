package application;

import java.util.Scanner;

import singleton.CadastroP;

public class Principal {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		
		  CadastroP p1 = CadastroP.getInstance();
		  //p1.setIdade(sc.next());
		  p1.setNome("visistante");
		 
    	
		/*
		 * CadastroP p2 = CadastroP.getInstance();
		 * 
		 * p2.setNome("Thais");
		 */
		  
		p1.ShowInfo();
		 
		/* p2.ShowInfo(); */
    	sc.close();
	}
}
