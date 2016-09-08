
public class SortStudentsOnGrades {

	public static void main(String[] args) {
		char[][] studentAnswers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] realAnswers = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		int[] ref = new int[studentAnswers.length];

		for (int i = 0; i < studentAnswers.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < studentAnswers[i].length; j++) {
				if (studentAnswers[i][j] == realAnswers[j])
					correctCount++;
			}
			// System.out.println("Student " + (i + 1) + "'s number of correct
			// answers is " + correctCount);
			ref[i] = correctCount;
		}
		int max = 0;
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] > max) {
				max = ref[i];
			}
		}

		for (int i = max; i > 0; i--) {
			max(ref, i);

		}
	}

	public static void max(int[] ref, int max) {
		for (int i = 0; i < max; i++) {
			if (max == ref[i])
				System.out.println("Student " + (i + 1) + "'s number of correct answers is: " + ref[i]);
		}
	}
}
