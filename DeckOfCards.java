/*
 * This program uses arrays to make a deck, and shuffles the cards
 * Then the user is given four cards of a rank and suit
 * */

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King" };
		
		for(int i=0;i<deck.length;i++){
			deck[i]=i;
		}
		
		for(int i =0; i<deck.length; i++){
			//Ok so we made a random card using Math.random
			int index = (int)Math.random()*52;
			//This temp variable allows us to switch the normal number and the random
			int temp = deck[i];
			//We switch the value of array with random number
			deck[i] = deck[index];
			//now we set the index of the random value to the original index of the array
			deck[index]=temp;
		}
		/*
		 * Now we are going to display the first four cards
		 * */
		System.out.println("Your cards are: \n");
		for(int i = 0; i<4; i++){
			/*
			 * Here we have an interesting situation where the element of one array is part
			 * of the index of another array. I should re-do this program.
			 * */
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			System.out.println(rank+ " of "+suit);
		}
	}
}
