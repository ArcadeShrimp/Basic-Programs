/*
 * This program takes the sum of the digits in an integer.
 * so if the input is 123 then the program will compute
 * 1+2+3 (actually its 3+2+1, but, math) which is 6;  
 * */

import java.util.Scanner;

public class SumDigitsInInt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Number: ");
		long test = input.nextLong();
		System.out.println("The sum of the digits in " + test + " equals: "
				+ SumDigits(test));
	}
	public static int SumDigits(long d) {

		int sum = 0;
		long temp = 0;

		while (d > 0) {
			temp = d % 10;
			sum+= temp;
			d /= 10;
		}
		return sum;
	}
}
