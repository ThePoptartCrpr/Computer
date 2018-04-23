package thepoptartcrpr.computer.components.memory;

import thepoptartcrpr.computer.components.calculation.CPU;

public class InputRegisters {
	
	private CPU cpu;
	private int size;
	private int[] inputs;
	private int[][] outputs;
	
	public InputRegisters(CPU cpu, int size) {
		this.inputs = new int[size];
		this.outputs = new int[2][size];
		this.cpu = cpu;
	}
	
	public void readFromRam() {
		
	}
	
	public void readFromCPU() {
		this.inputs = cpu.getOutput();
	}
	
	public void writeToA() {
		this.outputs[0] = this.inputs;
	}
	
	public void writeToB() {
		this.outputs[1] = this.inputs;
	}
	
	public int[][] getOutputs() {
		return new int[][] {this.outputs[0], this.outputs[1]};
	}
	
}
