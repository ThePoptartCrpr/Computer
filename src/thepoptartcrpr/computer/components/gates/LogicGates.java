package thepoptartcrpr.computer.components.gates;

public class LogicGates {
	
	public LogicGates() {
		
	}
	
	// Todo: Make more complex gates (xor, etc) use basic gates, i.e.
	// xnor would be a not of xoring the inputs
	// so it would simply return this.not(this.xor(a, b)) instead of calculating on its own
	
	public int and(int a, int b) {
		// if (a == 1 && b == 1) return 1;
		// else return 0;
		return a == 1 && b == 1 ? 1 : 0;
	}
	
	public int nand(int a, int b) {
		return this.not(this.and(a, b));
	}
	
	public int xor(int a, int b) {
		// if (a == b) return 0;
		// else return 1;
		return a == b ? 0 : 1;
	}
	
	public int xnor(int a, int b) {
		return this.not(this.xor(a, b));
	}
	
	public int or(int a, int b) {
		// if (a == 1 || b == 1) return 1;
		// else return 0;
		return a == 1 || b == 1 ? 1 : 0;
	}
	
	public int not(int a) {
		// if (a == 1) return 0;
		// else return 1;
		return a == 1 ? 0 : 1;
	}
	
	public int nor(int a, int b) {
		// if (a == 0 && b == 0) return 1;
		// else return 0;
		return a == 0 && b == 0 ? 1 : 0;
	}

}
