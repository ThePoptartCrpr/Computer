package thepoptartcrpr.computer.components.calculation.adder;

import java.util.Arrays;

import thepoptartcrpr.computer.components.gates.LogicGates;

public class AdderBit {
	
	private int[] inputs;
	private int carry;
	private LogicGates gates;
	private Adder adder;
	
	public AdderBit(Adder adder) {
		this.adder = adder;
		this.gates = new LogicGates();
		this.inputs = new int[] {0, 0};
		this.carry = 0;
	}
	
	public void setInputs(int[] inputs) {
		this.inputs[0] = inputs[0];
		this.inputs[1] = inputs[1];
	}
	
	public void setCarry(int carry) {
		this.carry = carry;
	}
	
	public int getOutput() {
		System.out.println(Arrays.toString(inputs) + " " + this.carry);
		// int output;
		if (gates.and(inputs[0], inputs[1]) == 1) adder.getNextBit(this).setCarry(1);
		int xored = gates.xor(inputs[0], inputs[1]);
		if (gates.and(gates.xor(inputs[0], inputs[1]), this.carry) == 1) adder.getNextBit(this).setCarry(1);
		return gates.xor(xored, this.carry);
	}

}
