package thepoptartcrpr.computer.components.memory;

import java.util.Arrays;

public class RAM {
	
	private int size;
	
	private int[][] memory;
	
	public RAM(int bits, int memory) {
		this.size = bits;
		this.memory = new int[memory][size];
	}
	
	public void setAddress(int address, int[] content) {
		this.memory[address] = content;
	}
	
	public int[] getAddress(int address) {
		return this.memory[address];
	}

}
