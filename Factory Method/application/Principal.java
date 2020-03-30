package application;

import javax.swing.JOptionPane;

import FactoryMethod.FactoryPessoa;
import FactoryMethod.Genero;
import FactoryMethod.Homem;
import FactoryMethod.Mulher;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryPessoa fp = new FactoryPessoa();
		
		
		
		Homem h = new Homem("", JOptionPane.showInputDialog("Digite o nome:"));
		Genero g1 = fp.getGenero(JOptionPane.showInputDialog("Digite o sexo:"));
		JOptionPane.showMessageDialog(null,g1.Saudacao());
		
		Mulher m = new Mulher("", JOptionPane.showInputDialog("Digite o nome:"));
		Genero g2 = fp.getGenero(JOptionPane.showInputDialog("Digite sexo:"));
		
		
		JOptionPane.showMessageDialog(null,g2.Saudacao());
	}

}
