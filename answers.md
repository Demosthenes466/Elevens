#Activity 7
1. Deck of cards, motor function, hands. Variables that would be required are the deck, score, and dealt cards.
2.examine the cards, 
	look for pairs which add to 11 or a Jack, Queen, and King,
	select the first pair of cards,
	replace those cards,
	hope,
	make sure the game has not been lost,
	examine the newly dealt cards, 
	repeat until no pairs remain,
	game is either won if the board is empty or lost if there are remaining cards.

3. No, It never knows when to quit the game. And it has no way of receiving input.
4.a) Its called in the ElevensBoard constructor
  b) anotherPlayIsPossible, isLegal,
  c) 0 : J | 1 : 6 | 2 : 2 | 3 : A | 4 : 4 |
  d) ```java
  public static printCards(ElevensBoard board) {
		List<Integer> cIndexes = board.cardIndexes();
		for(Card card : cIndexes) {
			System.out.println(card.toString());
		}
	}
	```
	e) isLegal because it will compare the cards you have selected to find out if they do add to 11 or are JQK.
