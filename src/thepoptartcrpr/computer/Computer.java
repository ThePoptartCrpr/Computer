package thepoptartcrpr.computer;

import thepoptartcrpr.computer.components.calculation.CPU;
import thepoptartcrpr.computer.components.memory.RAM;
import thepoptartcrpr.computer.components.other.Clock;

public class Computer {
	
	private int bits;
	
	private RAM ram;
	private CPU cpu;
	private Clock clock;
	
	public Computer(int bits) {
		this.bits = bits;
		this.ram = new RAM(bits);
		this.cpu = new CPU(bits);
		this.clock = new Clock();
	}
	
	public void start() {
		
	}

}
