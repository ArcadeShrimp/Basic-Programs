import java.util.Scanner;
public class AnalyzeScores {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of your array");
		
		float [] array = new float[input.nextInt()];
		
		System.out.println("List the elements of your array");
		
		for(int i = 0; i<array.length;i++){
			array[i]= input.nextFloat();
		}
		
		float average = average(array);
		System.out.println(average+ " is the average score");
		/*
		 * That will display how many van which values are about the average
		 * */
		int countA = 0;
		for(int i = 0; i<array.length;i++){
			if(array[i]>=average){
				countA++;
				System.out.println(array[i]+ " is above the average");
			}
		}
		System.out.println("\n\n" + countA +" scores are above the average");
		
		int countB = 0;
		for(int i = 0; i<array.length;i++){
			if(array[i]<average){
				countB++;
				System.out.println(array[i]+ " is below the average");
			}
		}
		System.out.println("\n\n" + countB +" scores are below the average");
	}
	
	
	public static float average(float[] array){
		float average;
		float sum = 0;
		
		for(int i = 0; i<array.length;i++){
			sum+=array[i];
		}
		average = sum/array.length;
		return average;
	}
}
