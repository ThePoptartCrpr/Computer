package thepoptartcrpr;

import thepoptartcrpr.computer.Computer;

public class UI {
	
	public static void main(String[] args) {
		// Creates an 8-bit computer
		Computer comp = new Computer(8);
		
		// Starts the computer
		comp.start();
	}

}
