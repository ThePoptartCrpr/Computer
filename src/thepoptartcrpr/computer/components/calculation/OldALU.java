package thepoptartcrpr.computer.components.calculation;

import java.util.Arrays;

import thepoptartcrpr.computer.components.calculation.adder.Adder;

public class OldALU {
	
	private int[][] values;
	private int[] output;
	private Adder adder;
	private CPU cpu;
	
	public OldALU(int size) {
		// this.cpu = cpu;
		this.adder = new Adder(size);
		
		this.values = new int[2][];
		this.output = new int[size];
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = 0;
		}
		// this.values[0] = arr;
		// this.values[1] = arr;
		int[] arr1 = new int[] {0, 0, 0, 0, 0, 0, 1, 1};
		int[] arr2 = new int[] {0, 0, 0, 0, 0, 0, 1, 1};
		
		this.values[0] = arr1;
		this.values[1] = arr2;
		// System.out.println(Arrays.deepToString(this.values));
		
		this.adder.setInputs(this.values);
		
		// System.out.println(Arrays.toString(cpu.getRam().getAddress(0)));
		// cpu.getRam().setAddress(0, arr2);
		// System.out.println(Arrays.toString(cpu.getRam().getAddress(0)));
	}
	
	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void add() {
		this.adder.setInputs(this.values);
		System.out.println(Arrays.toString(this.adder.getOutput()));
		// System.out.println(Arrays.toString(this.adder.getOutput()));
		
		// System.out.println(Arrays.deepToString(cpu.getRegisters().getOutputs()));
		// cpu.getRegisters().readFromCPU();
		// cpu.getRegisters().writeToA();
		// System.out.println(Arrays.deepToString(cpu.getRegisters().getOutputs()));
	}
	
	public int[][] getInputs() {
		return this.values;
	}
	
	public int[] getOutput() {
		this.output = this.adder.getOutput();
		return this.output;
	}
	
	public void invertA() {
		System.out.println("this " + Arrays.deepToString(this.values));
		for (int i = 0; i < this.values[0].length; i++) {
			// System.out.println(i);
			if (this.values[0][i] == 0) this.values[0][i] = 1;
			else if (this.values[0][i] == 1) this.values[0][i] = 0;
		}
		System.out.println("this " + Arrays.deepToString(this.values));
		this.add();
	}

}
