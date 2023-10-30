/**
 * The Deck class represents a pile of cards.
 */
public class Deck {
	private Card[] Deck;
	private int lastCard;
	private boolean gameOver = false;
	
	/**
	 * constructor - makes a deck containing one card for every 
	 * combination of features and sets the topOfDeck to the index
	 * of the last card.
	 */
	public Deck() {
		//--------------------
		// TODO: insert your code here.
		Deck = new Card[81];
		lastCard = -1;
		int[] icons = {0, 1, 2};
		int[] colors = {0, 1, 2};
		int[] number = {0, 1, 2,};
		int[] background = {0, 1, 2};
		int i = 0;
		for (int p = 0; p < icons.length; p++) {
			for (int q = 0; q < colors.length; q++) {
				for (int r = 0; r < number.length; r++) {
					for (int s = 0; s < background.length; s++) {
						Deck[i] = new Card(icons[p], colors[q], number[r], background[s]);
						i++;
					}
				}
			}
		}
		shuffle();
		lastCard = 0;

		//--------------------
	}
	
	/**
	 * dealCard - returns the card at the "top" of the deck, moving the
	 * "top" down one. 
	 * If the "top" is low enough to be past the end of the deck,
	 * then return null.
	 * @return the next card.
	 */
	public Card dealCard()
	{
		Card c = null;
		//--------------------
		// TODO: Insert your code here.
		if (!outOfCards()){
			lastCard = lastCard + 1;
			c = Deck[lastCard];
		}
		else{
			gameOver = true;
		}
		//--------------------
		return c;
	}

	/**
	 * indicates whether there are 1 or more Cards stored in this CardPile
	 * @return - whether this CardPile has any cards
	 */
	public int numCards()
	{
		return lastCard + 1;
	}

	/**
	 * shuffle - shuffles the cards in the deck by swapping many times.
	 * resets "top of deck" to the beginning.
	 * Note: no return value; just updates private variables.
	 */
	public void shuffle()
	{
		//--------------------
		// TODO: insert your code here.
		// Hint #1: Remember, (int)(Math.random()*52) will give you an integer from 0..51, inclusive.
		// Hint #2: 52 is not the number you want for this deck.
		for (int i = 0; i < numCards() * 3; i++)
		{
			int a = (int)(Math.random()*(numCards()));
			int b = (int)(Math.random()*(numCards()));

			if (a != b)
			{
				Card temp = Deck[a];
				Deck[a] = Deck[b];
				Deck[b] = temp;
			}

		}
		//--------------------
		
	}
	
	/**
	 * outOfCards - determines whether the "top of deck" has extended beyond the end of the Deck.
	 * @return - boolean; whether the top of deck is past the end of the deck
	 */
	public boolean outOfCards()
	{
		boolean pastEndOfDeck = false;
		//--------------------
		//TODO: insert your code here
		if (lastCard >= Deck.length)
		{
			pastEndOfDeck = true;
		}
		//--------------------
		return pastEndOfDeck;
	}
	
	
	/**
	 * toString - lists all the cards in the deck.
	 * @return a String with all the cards in it, in the current order, 
	 * with a marker (e.g., "-->" vs. "   ") where the top of the Deck is.
	 */
	public String toString()
	{
		String result = "";
		//--------------------
		// TODO: insert your code here. (optional, but suggested)
		// this is not something you'll use in the game, but might be handy
		//    for debugging.
		//--------------------
		return result;
	}
}
