import java.util.Scanner;
public class AssignGrades {
	static int best = 0;
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of scores: ");
		
		int numOfScores = input.nextInt();
		
		int [] scores = new int[numOfScores];
		
		/*
		 * This populates the array with the user input scores.
		 * */
		System.out.print("Enter the scores: ");
		for (int i =0; i<scores.length; i++){
			scores[i] = input.nextInt();
		}
		
		/*
		 * Now we need to find the best score
		 * */
		
		for (int i =0; i<scores.length;i++){
			if(scores[i]>best)
				best=scores[i];
		}
		
		/*
		 * Lastly we are going to print everyone's grade based on the curve
		 * */
		
		for(int i =0; i<scores.length; i++){
			System.out.println("Student "+ scores[i]+"score is " + grade(scores[i]));
		}
	}
	
	public static char grade(int x){
		char grade;
		if(x>=best-10) 
			grade='A';
		else if(x>=best-20) 
			grade='B';
		else if(x>=best-30) 
			grade='C';
		else if(x>=best-40) 
			grade='D';
		else
			grade='F';
		return grade;
	}
	
}
