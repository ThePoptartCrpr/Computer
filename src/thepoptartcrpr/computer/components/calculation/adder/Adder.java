package thepoptartcrpr.computer.components.calculation.adder;

import java.util.ArrayList;
import java.util.Arrays;

public class Adder {
	
	private int size;
	
	private AdderBit[] adders;
	
	public Adder(int size) {
		this.size = size;
		this.adders = new AdderBit[size];
		for (int i = 0; i < size; i++) {
			this.adders[i] = new AdderBit(this);
			// System.out.println(adders[i].getOutput());
		}
		// System.out.println(adders[7].getOutput());
	}
	
	public void setInputs(int[][] inputs) {
		for (int i = 0; i < this.size; i++) {
			this.adders[i].setInputs(new int[] {inputs[0][i], inputs[1][i]});
		}
	}
	
	/*public Integer[] getOutput() {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = size - 1; i >= 0; i--) {
			int o = this.adders[i].getOutput();
			output.add(0, o);
		}
		
		return output.toArray(new Integer[0]);
		// String str = Arrays.toString(arr);
		// String str = String.join(",", output.tos);
		// System.out.println(str);
		// return 1;
		// return Integer.parseInt(str);
		// return str;
	}*/
	
	public String getOutput() {
		String output = "";
		for (int i = size - 1; i >= 0; i--) {
			int o = this.adders[i].getOutput();
			output = o + output;
		}
		
		return output;
	}
	
	public AdderBit getNextBit(AdderBit bit) {
		int index = Arrays.asList(this.adders).indexOf(bit);
		index--;
		return this.adders[index];
	}

}
