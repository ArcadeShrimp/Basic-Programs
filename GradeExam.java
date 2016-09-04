
public class GradeExam {

	public static void main(String [] args){
		char [] [] studentAnswers = {
				{'A', 'B', 'A', 'C', 'C'},
				{'D', 'B', 'A', 'B', 'C'},
				{'E', 'D', 'D', 'A', 'C'}
		};
		
		char [] realAnswers = {'D', 'B', 'D', 'C', 'C'};
		
		for(int i=0; i<studentAnswers.length; i++){
			int correctCount = 0;
			for(int j=0; j<studentAnswers[i].length; j++){
				if (studentAnswers[i][j] == realAnswers[j])
					correctCount++;
			}
			System.out.println("Student "+ (i+1) + "'s number of correct answers is "+ correctCount);
		}
	}
}
