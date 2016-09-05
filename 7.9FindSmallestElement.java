import java.util.Scanner;
public class FindSmallestElement {
	public static void main(String[] args){
		
	
		System.out.println("Enter the length of you array");
		
		int [] array = new int[new Scanner(System.in).nextInt()];
		
		System.out.println("Enter those values");
		
		for (int i = 0; i<array.length;i++){
			array[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("The smallest element is: "+ findSmall(array));
	}
public static int findSmall(int [] array){
	int min = array[0];
	for(int i=0; i<array.length;i++){
		if(array[i]<min){
			min=array[i];
		}
	}
	return min;
}
}
