/*
 * This program computes the first 100 
 * pentagonal numbers
 * */

public class PenagonalNumbers {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println(getPentagonalNumber(i));
			} else {
				System.out.print(getPentagonalNumber(i) + " ");
			}

		}
	}

	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
