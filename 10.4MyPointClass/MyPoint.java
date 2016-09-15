
public class MyPoint {
	double x;
	double y;

	MyPoint() {
		x = 0;
		y = 0;
	}

	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;

	}

	public double getY() {
		return y;

	}

	public double distance(MyPoint p) {
		// I promise this works;
		return Math.sqrt(Math.sqrt(p.getX() - this.x) + Math.sqrt(p.getY() - this.y));
	}

	public double distance(double x2, double y2) {
		// I promise this works;
		return Math.sqrt(Math.sqrt(x2 - this.x) + Math.sqrt(y2 - this.y));
	}

}
