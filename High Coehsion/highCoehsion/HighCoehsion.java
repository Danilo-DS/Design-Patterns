package highCoehsion;

public class HighCoehsion {
	public HighCoehsion() {	}
	
	public void IniciarProcesso() {
		ConecetarBD conectar = new ConecetarBD();
		conectar.InicaConexao();
		
		ExibeRegistro exibir = new ExibeRegistro();
		exibir.MostraRegisro();
		
		FechaBD fechar = new FechaBD();
		fechar.FinalizaConexao();
	}
}

class ConecetarBD {
	public ConecetarBD() {}
	
	public void InicaConexao() {
		System.out.println("Inciando Conexão com BD...");
		System.out.println("Conexão estabelecida com BD");
	}
}

class ExibeRegistro {
	public ExibeRegistro() {}
	
	public void MostraRegisro() {
		System.out.println("Exibindo Registros");
	}
}
class FechaBD {
	public FechaBD() {}
	
	public void FinalizaConexao() {
		System.out.println("Fechando Registros Abertos...");
		System.out.println("Finalizando Conexão com BD");
	}
}