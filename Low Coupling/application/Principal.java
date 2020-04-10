package application;

import lowCoupling.Andando;
import lowCoupling.Bike;
import lowCoupling.Escola;

public class Principal {

	public static void main(String[] args) {
		
		Escola escola = new Escola();
		
		escola.setVaiDe(new Andando());
		escola.Indo();
		
		System.out.println("");
		
		escola.setVaiDe(new Bike());
		escola.Indo();
		
		
	}

}
