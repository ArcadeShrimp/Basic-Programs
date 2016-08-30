/*
 * Honestly, this is literally 50% of the Palindrome problem
 * it was good immediate review, I guess. All hail Lord Slug
 * */

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int test = input.nextInt();
		System.out.println("The reveres of " + test + " is: " + reverse(test));
	}

	public static int reverse(int number) {
		int reverse = 0;
		int temp = 0;
		while (number > 0) {
			reverse *= 10;
			temp = number % 10;
			number /= 10;
			reverse += temp;
		}
		return reverse;
	}
}
