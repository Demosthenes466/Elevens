/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		String[] ranks1 = {"jack", "queen", "king"};
		String[] suits1 = {"clubs", ""};
		int[] pointValues1 = {11, 12, 13};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);

		String[] ranks2 = {"jack", "queen", "king"};
		String[] suits2 = {"spades", "clubs", "hearts"};
		int[] pointValues2 = {11, 12, 13};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);

		String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	 	String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
	 	int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	 	Deck d = new Deck(ranks, suits, pointValues);


		// Deck deck1 = new Deck({"jack", "queen", "king"}, {"spades", "clubs", "hearts"}, {11,12,13});
		// Deck deck2 = new Deck({"ace", "nine", "eight"}, {"diamonds", "clubs", "hearts"}, {1,9,8});
		// Deck deck3 = new Deck({"seven", "twelve", "eight"}, {"clubs", "clubs", "hearts"}, {7,12,8});

		// System.out.println(deck1.toString());
		System.out.println(d.toString());
		// System.out.println(deck3.toString());
	}
}
