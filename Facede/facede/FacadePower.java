package facede;

public class FacadePower {
	private Cpu cpu;
	private Memoria memoria;
	private HardDrive hd;
	
	public FacadePower() {
		cpu = new Cpu();
		memoria = new Memoria();
		hd = new HardDrive();
	}
	
	public void powerCPU() {
		System.out.println(cpu.start());
		System.out.println(cpu.excute());
		System.out.println(cpu.load());
		System.out.println(cpu.free());
	}
	
	public void loadMemory() {
		System.out.println(memoria.load());
		System.out.println(memoria.free());
	}
	
	public void loadHD() {
		System.out.println(hd.read());
		System.out.println(hd.write());
	}
	
}
