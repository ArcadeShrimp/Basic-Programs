import java.util.Scanner;
public class ReverseNumbers {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in your array: ");
		
		int [] array = new int[input.nextInt()];
		
		System.out.println("Now enter the values of that array: ");
		
		for(int i =0;i<array.length;i++){
			array[i]= input.nextInt();
		}
		System.out.println("Now with the power of magic, I shall reverse the values you have entered!");
		
		for(int i =0; i<array.length;i++){
			System.out.println(array[array.length-1-i]);
		}
	}
}
