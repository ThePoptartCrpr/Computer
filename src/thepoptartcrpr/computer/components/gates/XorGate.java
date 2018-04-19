package thepoptartcrpr.computer.components.gates;

public class XorGate {
	
	public XorGate() {
		
	}
	
	public int xor(int a, int b) {
		// System.out.println(a + " " + b);
		if (a == b) return 0;
		else return 1;
	}

}
