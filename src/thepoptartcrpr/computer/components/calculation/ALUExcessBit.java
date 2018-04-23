package thepoptartcrpr.computer.components.calculation;

import thepoptartcrpr.computer.components.gates.LogicGates;

public class ALUExcessBit extends ALUBit {
	
	private int carry;
	private ALU alu;
	
	public ALUExcessBit(ALU alu) {
		super(alu);
		this.carry = 0;
		this.alu = alu;
	}
	
	public void carryIn() {
		/*if (this.carry == 1) {
			this.alu.getNextBit(this).carryIn();
			this.carry = 0;
		}
		else this.carry = 1;*/
		// if (this.carry == 1) this.alu.getNextBit(this).carryIn(1);
		// this.carry = gates.xor(1, this.carry);
		this.carry = 1;
	}
	
	public void carryIn(int carry) {
		// System.out.println("carry in called!");
		this.carry = 1;
	}
	
	public int getOutput() {
		return this.carry;
	}

}
