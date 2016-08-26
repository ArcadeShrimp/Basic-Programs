/*
 * So this program estimates the value of pi using series
 * A number is input by the user and that determines how many
 * times an operation is made.
 * */

import java.util.Scanner;
public class EstimatePi {

	public static void main(String [] args){
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("enter how accurate your estimation to pi blah blah fucking blah");
	   
	   int accuracy = input.nextInt();
	   System.out.println("i\t\t m(i)\n-----------------------");
	   
		   calculation(accuracy);
		   
	   System.out.printf(accuracy+"\t\t%.5f", calculation(accuracy));
	}
	public static double calculation(int i){
		double k = 0;
		double b = i;
		for(int j = 1; j <= i;j++){
			k += Math.pow(-1, (j+1))/((2*j)-1);		
		}
		k*=4;
		return k;
	}
}
