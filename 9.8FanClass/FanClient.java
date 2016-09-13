
public class FanClient {
	public static void main(String [] args){
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		
		f1.setSpeed(Fan.FAST);
		f1.setRadius(10);
		f1.setColor("Yellow");
		f1.setOn(true);
		
		f2.setSpeed(Fan.MEDIUM);
		f2.setRadius(5);
		f2.setColor("Blue");
		f2.setOn(false);
		
		System.out.println("Fan 1 description: \n"+f1.toString());
		System.out.println("\n\nFan 2 description: \n"+f2.toString());
	}
}
