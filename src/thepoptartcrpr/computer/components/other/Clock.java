package thepoptartcrpr.computer.components.other;

public class Clock {
	
	private int speed;
	private boolean running;
	
	public Clock(int speed) {
		this.speed = speed;
	}
	
	public Clock() {
		this.speed = 1000;
	}
	
	public void start() {
		this.running = true;
	}
	
	public void stop() {
		this.running = false;
	}
	
	public void setSpeed(int speed) {
		
	}

}
