package thepoptartcrpr.computer.components.calculation;

import java.util.Arrays;

import thepoptartcrpr.computer.components.gates.LogicGates;

public class ALUBit {
	
	private int[] inputs;
	private int carry;
	private LogicGates gates;
	private ALU alu;
	
	public ALUBit(ALU alu) {
		this.gates = new LogicGates();
		this.inputs = new int[] {0, 0};
		this.carry = 0;
		this.alu = alu;
	}
	
	public void setInputs(int[] inputs) {
		this.inputs[0] = inputs[0];
		this.inputs[1] = inputs[1];
	}
	
	public void setCarry(int carry) {
		this.carry = carry;
	}
	
	public void carryIn() {
		if (this.carry == 1) {
			this.alu.getNextBit(this).carryIn();
			this.carry = 0;
		}
		else this.carry = 1;
	}
	
	public int getCarry() {
		return this.carry;
	}
	
	public void invertA() {
		this.inputs[0] = gates.not(inputs[0]);
	}
	
	public void invertB() {
		this.inputs[1] = gates.not(this.inputs[1]);
	}
	
	public int getOutput() {
		System.out.println(Arrays.toString(inputs) + " " + this.carry);
		if (gates.and(inputs[0], inputs[1]) == 1) this.alu.getNextBit(this).carryIn();
		int xored = gates.xor(inputs[0], inputs[1]);
		if (gates.and(gates.xor(inputs[0], inputs[1]), this.carry) == 1) this.alu.getNextBit(this).carryIn();
		return gates.xor(xored, this.carry);
	}

}
