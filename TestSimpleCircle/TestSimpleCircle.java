
public class TestSimpleCircle {
	public static void main(String[] args) {
		System.out.println(SimpleCircle.numOfObjects);
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		SimpleCircle circle2 = new SimpleCircle(5);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		SimpleCircle circle3 = new SimpleCircle(125);		
		System.out.println("The area of the circle of radius " + circle3.radius + " is "+circle3.getArea());
		
		circle2.radius=100;
		System.out.println("The new area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		System.out.println(SimpleCircle.numOfObjects);
	}
}
