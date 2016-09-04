
public class LettersInArray {

	public static void main(String[] args){
		char [] characters = createArray();
		
		System.out.println("The lowercase letters are: ");
		displayArray(characters);
		
		int [] counts = countLetters(characters);
		
		System.out.println("\n"+"The occurences of each letter are:\n");
		displayCounts(counts);
	}
	
	public static char [] createArray(){
		char[] characters = new char [100];
		
		//populate the array
		for(int i =0; i<characters.length;i++){
			characters[i] = RandomCharacterAgain.getRandomLowerCaseLetter();
		}
		return characters;
	}
	public static void displayArray(char[] chars){
		
		for(int i =0;i < chars.length; i++){
			if((i+1)%20 == 0){
				System.out.println(chars[i]);
			}
			else{
				System.out.print(chars[i]+" ");
			}
		}
	}
	public static int[] countLetters(char[] chars){
		int[] counts = new int[26];
		
		for(int i =0; i<counts.length; i++){
			counts[chars[i]-'a']++;
		}
		return counts;
	}
	public static void displayCounts(int[] counts){
		for(int i = 0; i<counts.length; i++){
			if((i+1) %10 ==0){
				System.out.println(counts[i]+ " "+ (char)(i+'a'));
			}
			else{
				System.out.println(counts[i]+ " "+ (char)(i+'a')+ " ");
			}
		}
	}
}

