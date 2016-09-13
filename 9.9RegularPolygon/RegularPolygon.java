
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	RegularPolygon() {

	}

	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}

	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getNumOfSides() {
		return n;
	}

	public double getSides() {
		return side;
	}

	public double getXCoordinate() {
		return x;
	}

	public double getYCoordinate() {
		return y;
	}

	public void setNumOfSides(int n) {
		this.n = n;
	}

	public void setSides(double side) {
		this.side = side;
	}

	public void setXCoordinate(double x) {
		this.x = x;
	}

	public void setYCoordinate(double y) {
		this.y = y;
	}
	public double getPerimeter(){
		return n*side;
	}
	public double getArea(){
		return ((n*side*side)/(4*Math.tan(Math.PI/n)));
	}
	
}
