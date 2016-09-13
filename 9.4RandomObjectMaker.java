import java.util.Random;
public class RandomObjectMaker {
	public static void main(String[]args){
		Random totallyRandom = new Random(1000);
		
		firstFiddy(totallyRandom);
	}
	public static void firstFiddy(Random r){
		for(int i =0;i<50;i++){
			System.out.println(r.nextInt(100));
		}
	}
}
