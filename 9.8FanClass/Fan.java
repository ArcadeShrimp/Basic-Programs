
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	public int getSpeed() {
		return speed;
	}

	public double getRadius() {
		return radius;
	}

	public boolean getOn() {
		return on;
	}

	public String getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	Fan() {
	}

	public String toString() {
		if (on == true) {
			return "Fan Speed: " + Integer.toString(speed) + "\nColor: " + color + "\nRadius: "
					+ Double.toString(radius);
		} else{
			return "Fan Color: " + color + "\nRadius: " + Double.toString(radius) + "\nFan is off";
		
		}
	}
}
