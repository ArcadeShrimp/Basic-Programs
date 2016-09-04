import java.util.Scanner;
public class LinearSearch {

	public static void main(String [] args){
		
		System.out.println("Enter the number you're looking for");
		int x = new Scanner(System.in).nextInt();
		int [] test1 = {1,4,3,4,2,4,4,234,27,5};
		System.out.println(linearSearch(test1,x));
	}
	
	public static int linearSearch(int[] list, int key){
		for(int i = 0; i<list.length;i++){
			if(list[i]==key){
				return i;
			}
			
			
		}
		return -1;
	}
}
