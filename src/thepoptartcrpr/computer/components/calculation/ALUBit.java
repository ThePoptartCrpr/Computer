package thepoptartcrpr.computer.components.calculation;

import java.util.Arrays;

import thepoptartcrpr.computer.components.gates.LogicGates;

public class ALUBit {
	
	private int[] inputs;
	private int output;
	private int carry;
	private LogicGates gates;
	private ALU alu;
	
	public ALUBit(ALU alu) {
		this.gates = new LogicGates();
		this.inputs = new int[] {0, 0};
		this.output = 0;
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
		/*if (this.carry == 1) {
			this.alu.getNextBit(this).carryIn();
			this.carry = 0;
		}
		else this.carry = 1;*/
		if (this.carry == 1) this.alu.getNextBit(this).carryIn();
		this.carry = gates.xor(1, this.carry);
	}
	
	/*public void carryIn(int carry) {
		this.alu.getNextBit(this).carryIn(gates.and(carry, this.carry));
		this.carry = gates.xor(carry, this.carry);
	}*/
	
	public int getCarry() {
		return this.carry;
	}
	
	public void invertA() {
		this.inputs[0] = gates.not(this.inputs[0]);
	}
	
	public void invertB() {
		this.inputs[1] = gates.not(this.inputs[1]);
	}
	
	public void add() {
		if (gates.and(inputs[0], inputs[1]) == 1) this.alu.getNextBit(this).carryIn();
		int xored = gates.xor(inputs[0], inputs[1]);
		if (gates.and(gates.xor(inputs[0], inputs[1]), this.carry) == 1) this.alu.getNextBit(this).carryIn();
		this.output = gates.xor(xored, this.carry);
	}
	
	public int getOutput() {
		System.out.println(Arrays.toString(inputs) + " " + this.carry);
		/*if (gates.and(inputs[0], inputs[1]) == 1) this.alu.getNextBit(this).carryIn();
		int xored = gates.xor(inputs[0], inputs[1]);
		if (gates.and(gates.xor(inputs[0], inputs[1]), this.carry) == 1) this.alu.getNextBit(this).carryIn();
		return gates.xor(xored, this.carry);*/
		return this.output;
	}

}
