package highCoehsion;

public class LowCoehsion {
	
	public LowCoehsion() {
		
	}
	
	public void ConectarBanco() {
		System.out.println("Inciando Conex�o com BD...");
		System.out.println("Conex�o estabelecida com BD");
	}
	
	public void ConsultaRegistros() {
		System.out.println("Exibindo Registros");
	}
	
	public void FinalizaConex�o() {
		System.out.println("Fechando Registros Abertos...");
		System.out.println("Finalizando Conex�o com BD");
	}
}
