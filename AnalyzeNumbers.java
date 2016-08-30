import java.util.Scanner;

public class AnalyzeNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many items do you want in your list?");
		int x = input.nextInt();
		double[] list = new double[x];
		System.out.println("Enter the numbers going into the list.");
		double sum = 0;
		/*
		 * This populates the array with user input.
		 */
		for (int i = 0; i < list.length - 1; i++) {
			list[i] = input.nextDouble();
		}
		/*
		 * Now to find the average
		 */
		for (int i = 0; i < list.length - 1; i++) {
			sum += list[i];
		}
		double average = sum / x;
		/*
		 * Now to check to see how many numbers are above the average
		 */
		int aboveAverage = 0;
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > average) {
				aboveAverage++;
				System.out.println(list[i]);
			}
		}
		System.out.println("There are: " + aboveAverage
				+ " numbers above average.");
	}
}
