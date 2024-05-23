package EstructuralFacade;

public class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public ComputerFacade() {
		cpu = new CPU();
		memory = new Memory();
		hardDrive = new HardDrive();
	}
	
	public void start() {
		cpu.start();
		memory.loadMem();
		hardDrive.read();
	}
}
