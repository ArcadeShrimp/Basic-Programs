/*
 * This is the infamous Palindrome problem, which i have done before, but 
 * this time it took me 8 less hours. Then again, I didn't have as much
 * experience as I do now.
 * */

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to test of it's a palindrome");
		int test = input.nextInt();
		if (isPalindrome(test) == true) {
			System.out.println("The number " + test + " is a Palindrome!");
		} else {
			System.out.println("Totes not a palindrome");
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		int temp = 0;

		while (number > 0) {
			reverse *= 10;
			temp = number % 10;
			reverse += temp;
			number /= 10;
		}
		System.out.println(reverse);
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}
	}
}