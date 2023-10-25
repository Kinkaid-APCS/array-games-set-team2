import java.util.Scanner;
/**
 * The Referee class keeps track of a Board, which in turn 
 * holds a Deck of Cards. The Referee is responsible for communicating 
 * the player and the board to make sure that the board is displayed 
 * regularly, the user is asked for "SET"s of cards, and the board is
 * consulted on whether the user is correct before removing them.
 * If the board is empty, or the player gives up, the player can play again.
 * Advanced: if the player is stumped with 12 cards, give him/her the
 * chance to add three more cards.
 */
public class Referee {
	// TODO: decide which private member variables the Referee class needs and declare them here.

	int currentScore = 0;
	int amountOfCards = 81;
	Card [] selection;
	Deck myDeck;

	private Scanner keyReader;
	/**
	 * constructor
	 */
	// TODO: write the Referee's constructor method.
	public Referee()
	{
		keyReader = new Scanner(System.in);
	}
	/**
	 * playGame - the main game loop for the program.
	 */
	public void playGame() {
		// TODO: write the Referee's playGame method.

		System.out.println("Playing game."); // placeholder code
		while (amountOfCards >= 3) {
		askUserForSets();
		}
		System.out.println("Your final score was " + currentScore);
	}

	public void addCards3()
	{
//add 3 cards to the board if the user can't find a set

	}
	public int[] askUserForSets()
	{

		System.out.println("Do you see a set? Type yes or no.");
		String yesOrNo = keyReader.nextLine();
		if (yesOrNo.equals("no")){
			addCards3();
			return null;
		} else {
			System.out.println("Which 3 cards make a set?");
			int x1 = keyReader.nextInt();
			int x2 = keyReader.nextInt();
			int x3 = keyReader.nextInt();
            String dummy = keyReader.nextLine();
			return new int[]{x1, x2, x3};
		}
	}
	public boolean checkForSet(int[] askUserForASets)
	{
		if (askUserForSets()== null) {
			return false;
		} else {

		//use the multiple of threes trick





			currentScore = currentScore + 3;
			return true;
		}
	}
	public void removeSet(boolean checkForSet, int[] askUserForASets)
	{
		if (checkForSet) {
			//remove the three cards that are found to be apart of the true set
			amountOfCards = amountOfCards -3;
		}
	}
}
