package thepoptartcrpr.computer.components.calculation;

import java.util.Arrays;

import thepoptartcrpr.computer.components.calculation.adder.Adder;
import thepoptartcrpr.computer.components.calculation.adder.AdderBit;

public class ALU {
	
	private int[][] inputs;
	private int[] output;
	private int size;
	private CPU cpu;
	private ALUBit overflowBit;
	private ALUBit[] bits;
	private ALUBit underflowBit;
	
	public ALU(int size) {
		this.size = size;
		this.output = new int[this.size];
		this.inputs = new int[][]{{0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 0}};
		this.bits = new ALUBit[this.size];
		for (int i = 0; i < size; i++) {
			this.bits[i] = new ALUBit(this);
			this.bits[i].setInputs(new int[] {this.inputs[0][i], this.inputs[1][i]});
		}
		this.overflowBit = new ALUBit(this);
		this.underflowBit = new ALUBit(this);
	}
	
	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void add() {
		// this.invertA();
		this.invertB();
		this.bits[this.size - 1].carryIn();
		// this.bits[this.size - 1].carryIn();
		System.out.println(Arrays.toString(this.getOutput()));
	}
	
	public void invertA() {
		for (ALUBit bit : this.bits) {
			bit.invertA();
		}
	}
	
	public void invertB() {
		for (ALUBit bit : this.bits) {
			bit.invertB();
		}
	}
	
	public ALUBit getNextBit(ALUBit bit) {
		int index = Arrays.asList(this.bits).indexOf(bit);
		index--;
		if (index < 0) return this.overflowBit;
		if (index > this.size) return this.underflowBit;
		return this.bits[index];
	}
	
	public void carryIn() {
		this.bits[this.size - 1].carryIn();
	}
	
	public int[][] getInputs() {
		return this.inputs;
	}
	
	public int[] getOutput() {
		for (int i = this.size - 1; i >= 0; i--) {
			int o = this.bits[i].getOutput();
			this.output[i] = o;
		}
		return this.output;
	}

}
