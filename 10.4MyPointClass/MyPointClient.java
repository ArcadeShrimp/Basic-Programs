
public class MyPointClient {
	public static void main(String[] args) {
		MyPoint point = new MyPoint();
		MyPoint point2 = new MyPoint(10,30.5);
		
		System.out.println("The distance is :"+ point.distance(point2));
	}
}
