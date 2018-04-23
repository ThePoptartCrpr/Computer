package thepoptartcrpr.computer.components.calculation;

import thepoptartcrpr.computer.Computer;
import thepoptartcrpr.computer.components.memory.InputRegisters;
import thepoptartcrpr.computer.components.memory.RAM;

public class CPU {
	
	private ALU alu;
	private Computer comp;
	private InputRegisters inputRegisters;
	
	public CPU(int size, Computer comp) {
		this.inputRegisters = new InputRegisters(this, size);
		this.comp = comp;
		this.alu = new ALU(size);
		alu.setCPU(this);
		alu.add();
	}
	
	public RAM getRam() {
		return this.comp.getRam();
	}
	
	public InputRegisters getRegisters() {
		return this.inputRegisters;
	}
	
	public int[] getOutput() {
		return this.alu.getOutput();
	}

}
