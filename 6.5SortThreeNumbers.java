/*
 * This program sorts and displays 3 numbers. It does not showcase
 * a particular sorting algorithm and is not scalable.
 * */

import java.util.Scanner;

public class SortThreeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integers to be sorted");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		displaySortedNumbers(num1,num2,num3);
	}

	public static void displaySortedNumbers(int num1, int num2, int num3) {

		if(num1>num2){
			System.out.print(num1);
			lastCalculation(num2,num3);
		}
		else if(num2>num1){
			System.out.print(num2);
			lastCalculation(num1,num3);
		}
		else if(num2>num3){
			System.out.print(num2);
			lastCalculation(num1,num3);
		}
		else if(num1>num3){
			System.out.print(num1);
			lastCalculation(num2,num3);
		}
		
	}
	public static void lastCalculation(int num1, int num2){
		if(num1>num2){
			System.out.print(" "+num1+" "+num2);
		}
		else{
			System.out.print(" "+num2+" "+num1);
		}
	}
}