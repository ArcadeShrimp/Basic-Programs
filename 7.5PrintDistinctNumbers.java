import java.util.Scanner;

public class PrintDistinceNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int[] array = new int[input.nextInt()];
		System.out.println("Now, enter the values of that array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		/*
		 * Get array max first
		 */

		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		// System.out.println(max);
		int distinctNum = 1;
		for (int i = 0; i < max; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] == i) {
					distinctNum++;
					break;
				}
			}
		}
		int[] array2 = new int[distinctNum];

		/*
		 * What i Need to do is cross reference the values from the original
		 * array with every value from the distinct array. If there is no match,
		 * I can add the value from the original array to the distinct array
		 */
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			boolean x = true;
			if (index == array2.length) {
				break;
			}
			for (int j = 0; j < array2.length; j++) {
				if (array[i] == array2[j]) {
					x = false;
					break;
				}
			}
			if(x == true){
			array2[index] = array[i];
			index++;
			}
		}

		System.out.println("Distinct numbers: " + distinctNum);
		System.out.println("Those numbers are: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
