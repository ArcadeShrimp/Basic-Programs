import java.util.Scanner;
public class TriangleClient {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of a trianlge\n\nSide 1: ");
		
		double side1 = input.nextDouble();
			System.out.println("Side 2: ");
		double side2 = input.nextDouble();
			System.out.println("Side 3: ");
		double side3 = input.nextDouble();
		
		System.out.println("Enter the color:");
		
		String color = input.next();
		
		System.out.println("Enter boolean value for the filled state: ");
		
		boolean filled = input.nextBoolean();
		
		Triangle tri = new Triangle(side1,side2,side3);
		tri.setFilled(filled);
		tri.setColor(color);
		
		
		System.out.println(tri.toString()+"\n");
	}
}
