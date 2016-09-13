
public class RegularPolygonClient {
	public static void main(String[] args){
		RegularPolygon regPoly1 = new RegularPolygon();
		RegularPolygon regPoly2 = new RegularPolygon(6,4);
		RegularPolygon regPoly3 = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("The Area of Polygon 1 is: "+ regPoly1.getArea()+
				"\nThe Perimeterof Polygon 1 is: "+ regPoly1.getPerimeter()+
				"\n\nThe Area of Polygon 2 is: "+ regPoly2.getArea()+
				"\nThe Perimeterof Polygon 2 is: "+ regPoly2.getPerimeter()+
				"\n\nThe Area of Polygon 3 is: "+ regPoly3.getArea()+
				"\nThe Perimeterof Polygon 3 is: "+ regPoly3.getPerimeter());
		
		Double d =Double.valueOf("23.45");
		System.out.println(d);
	}
}
