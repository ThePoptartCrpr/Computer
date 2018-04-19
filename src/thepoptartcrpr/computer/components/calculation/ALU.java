package thepoptartcrpr.computer.components.calculation;

import java.util.Arrays;

import thepoptartcrpr.computer.components.calculation.adder.Adder;

public class ALU {
	
	private int[][] values;
	private Adder adder;
	
	public ALU(int size) {
		this.adder = new Adder(size);
		
		this.values = new int[2][];
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = 0;
		}
		// this.values[0] = arr;
		// this.values[1] = arr;
		int[] arr1 = new int[] {0, 0, 0, 0, 0, 0, 0, 1};
		int[] arr2 = new int[] {0, 0, 0, 0, 0, 0, 1, 1};
		
		this.values[0] = arr1;
		this.values[1] = arr2;
		// System.out.println(Arrays.deepToString(this.values));
		
		this.adder.setInputs(this.values);
		
		this.add();
	}
	
	public void add() {
		System.out.println(Arrays.toString(this.adder.getOutput()));
	}

}
