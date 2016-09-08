
public class RectangleTest {
	public static void main(String[] args){
		Rectangle myBillionthRectangle = new Rectangle(4,40);
		Rectangle myBillionAndOnethRectangle = new Rectangle(3.5,35.9);
		
		System.out.println("The width of the first rectangle is: "+ myBillionthRectangle.getWidth());
		System.out.println("The height of the first rectangle is: "+ myBillionthRectangle.getHeight());
		System.out.println("The area of the first rectangle is: "+ myBillionthRectangle.getArea());
		System.out.println("The perimeter of the first rectangle is: "+ myBillionthRectangle.getPerimeter()+"\n\n");
		
		
		System.out.println("The width of the second rectangle is: "+ myBillionAndOnethRectangle.getWidth());
		System.out.println("The height of the second rectangle is: "+ myBillionAndOnethRectangle.getHeight());
		System.out.println("The area of the second rectangle is: "+ myBillionAndOnethRectangle.getArea());
		System.out.println("The perimeter of the second rectangle is: "+ myBillionAndOnethRectangle.getPerimeter());
	}
}
