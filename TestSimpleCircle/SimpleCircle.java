
public class SimpleCircle {
	 double radius=1;
	 static int numOfObjects=0;
	/*
	 * Constructor no-arg
	 * */
	SimpleCircle(){
		radius=1;
		numOfObjects++;
	}
	SimpleCircle(double Radius){
		radius=Radius;
		numOfObjects++;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
	static int getNumberOfObjects(){
		return numOfObjects;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double RADIUS){
		radius=RADIUS;
	}
}
