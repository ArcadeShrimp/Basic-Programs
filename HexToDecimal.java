import java.util.Scanner;
public class HexToDecimal {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		/*Prompt user to enter a hex number as a string*/
		System.out.println("Enter a hexadecimal number");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for the hex number: "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()));
	}
	
	public static int hexToDecimal(String hex){
		/*
		 * This will iterate through every character of the string and 
		 * return the equivalent decimal value
		 * 
	     */
		int decimalValue = 0;
		
		for(int i=0; i<hex.length(); i++){
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch){
		/*This is where the conversion from hex to decimal occurs
		 */
		if(ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';		
	}
}
