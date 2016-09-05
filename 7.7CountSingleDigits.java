public class CountSingleDigits {
	public static void main(String[] args){
		
		System.out.println("Enter length of array");
		
		int [] array = new int[100];
		
		
		
		for(int i = 0;i<array.length;i++){
			array[i]= (int)(Math.random()*10);
		}
		System.out.print("Number:\t");
		int [] counts = {0,1,2,3,4,5,6,7,8,9};
		for (int i=0; i<counts.length;i++){
			System.out.printf("%d  ",counts[i]);
		}
		System.out.println("\n");
		System.out.print("Count:\t");
		for(int i = 0;i<counts.length;i++){
			int count=0;
			for(int j = 0; j<array.length;j++){
				
				if(array[j]==counts[i]){
					count++;
				}
			}
			System.out.printf("%2d ",count);
		}
	}
}
