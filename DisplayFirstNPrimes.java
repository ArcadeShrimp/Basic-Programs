/*
 * This program will display the first n prime numbers based on user input 
 */

import java.util.Scanner;

public class DisplayFirstNPrimes {

	public static void main(String[] args) {
		System.out.println("How many prime numbers do you want to see?");
		
		Scanner input = new Scanner(System.in);
		int numOfPrimes = input.nextInt();
		
		System.out.println("How many prime numbers do you want per line?");
		int primesPerLine = input.nextInt();
		
		printPrimeNumbers(numOfPrimes, primesPerLine);
	}
/*this prints out the prime numbers after determining if the number is prime or not*/
	public static void printPrimeNumbers(int x, int y) {
		final int NUMBER_OF_PRIMES_PER_LINE = y; // displays 10 primes per line
		int count = 0;
		int primeTest = 2;

		for (primeTest = 2; count < x; primeTest++) {

			if (isPrime(primeTest) == true) {
				System.out.printf("%-5s", primeTest);
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.print("\n");
				}
			}
		}
	}
/* This determines if a number is prime or not*/
	public static boolean isPrime(int x) {
		boolean result = true;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

}