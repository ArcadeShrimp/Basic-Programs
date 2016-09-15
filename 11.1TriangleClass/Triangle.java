
public class Triangle extends GeometricObject{
	double side1 =1;
	double side2 =1;
	double side3 =1;
	
	Triangle(){
		
	}
	Triangle(double side1,double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		double p = (side1+side2+side3)/2;		
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}
	public String toString(){
		return "\n\nTriangle: side1 = " + side1 + "\nside2 = " + side2 +
				"\nside3 = " + side3+"\n"+"Perimeter: "+getPerimeter()+"\nArea: "+getArea()+"\n"+super.toString();
	}
}
