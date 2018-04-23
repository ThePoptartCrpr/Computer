package thepoptartcrpr.computer.components.gates;

public class LogicGates {
	
	public LogicGates() {
		
	}
	
	public int and(int a, int b) {
		if (a == 1 && b == 1) return 1;
		else return 0;
	}
	
	public int xor(int a, int b) {
		if (a == b) return 0;
		else return 1;
	}
	
	public int xnor(int a, int b) {
		if (a == b) return 1;
		else return 0;
	}
	
	public int or(int a, int b) {
		if (a == 1 || b == 1) return 1;
		else return 0;
	}
	
	public int not(int a) {
		if (a == 1) return 0;
		else return 1;
	}
	
	public int nor(int a, int b) {
		if (a == 0 && b == 0) return 1;
		else return 0;
	}

}
