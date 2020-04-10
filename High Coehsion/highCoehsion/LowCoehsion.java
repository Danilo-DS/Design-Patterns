package highCoehsion;

public class LowCoehsion {
	
	public LowCoehsion() {
		
	}
	
	public void ConectarBanco() {
		System.out.println("Inciando Conexão com BD...");
		System.out.println("Conexão estabelecida com BD");
	}
	
	public void ConsultaRegistros() {
		System.out.println("Exibindo Registros");
	}
	
	public void FinalizaConexão() {
		System.out.println("Fechando Registros Abertos...");
		System.out.println("Finalizando Conexão com BD");
	}
}
