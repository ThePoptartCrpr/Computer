package thepoptartcrpr.computer.components.calculation;

public class CPU {
	
	private ALU alu;
	
	public CPU(int size) {
		this.alu = new ALU(size);
	}

}
