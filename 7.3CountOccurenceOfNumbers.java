import java.util.Scanner;
public class CountOccurenceOfNumbers {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of your array");
		
		int [] array = new int [input.nextInt()];
		
		System.out.println("Enter the elements in your array");
		for(int i =0; i<array.length;i++){
			array[i] = input.nextInt();
		}
		for(int i =1;i<100;i++){
			int count = 0;
			for(int j = 0;j<array.length;j++){
				if(array[j]==i){
					count++;
				}
			}
			if(count==1){
				System.out.println(i+" occurs "+count+" time");
			}
			else if(count > 1){
				System.out.println(i+" occurs "+count+" times");
			}
			
		}
	}
}
