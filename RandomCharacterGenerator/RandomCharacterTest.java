/*
 * This program generates a random sequence of random chars
 * based on the current nanosecond 
 * 
 * I think this can be used in encryption. At least, this is 
 * step 1-ish of encryption. I think.
 * */
import java.util.Scanner;

public class RandomCharacterTest {

	public static void main(String[] args) {
		System.out.println("How many random characters do you want?");
		Scanner input = new Scanner(System.in);

		final int NUMBER_OF_CHARS = input.nextInt();

		System.out.println("Enter the type of random characters:\n\nLowercase\tUppercase\tRandom Mix");
		
		Scanner input2 = new Scanner(System.in);
		String type = input2.nextLine();
		
		type = type.toLowerCase();
		
		final int CHARS_PER_LINE = 25;

		for (int i = 0; i < NUMBER_OF_CHARS; i++) {

			char ch;
			if (type.matches("lowercase")) {
				ch = RandomCharacter.getRandomLowerCaseLetter();
			} else if (type.matches("uppercase")) {
				ch = RandomCharacter.getRandomUpperCaseLetter();
			} else {

				long r = java.lang.System.nanoTime();

				int a = (72 - ((int) r)) % 100;
				
				
				if (a >= 0 && a < 33) {
					ch = RandomCharacter.getRandomLowerCaseLetter();
				} else if (a >= 33 && a < 67) {
					ch = RandomCharacter.getRandomUpperCaseLetter();
				} else {
					ch = RandomCharacter.getRandomDigitCharacter();
				}

			
			}
			if ((i + 1) % CHARS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}
/*I realize now I could have made this program about 
 * a billion times more efficient. God Dammit.
 * */
 