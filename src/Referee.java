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
	int amountOfCards = 0;
	/**
	 * constructor
	 */
	// TODO: write the Referee's constructor method.
	
	/**
	 * playGame - the main game loop for the program.
	 */
	public void playGame() {
		// TODO: write the Referee's playGame method.

		System.out.println("Playing game."); // placeholder code
		addCards12();
		for (amountOfCards >= 3) {
		askUserForSets();
		}
		System.out.println("Your final score was " + currentScore);
	}
	public void addCards12()
	{
		//adds the initial 12 cards at the beginning of the game
	}
	public void addCards3()
	{
//add 3 cards to the board if the user can't find a set

	}
	public int[] askUserForSets()
	{
		Scanner seeASet = new Scanner(System.in);
		System.out.println("Do you see a set? Type yes or no.");
		String yesOrNo = seeASet.nextLine();
		if (yesOrNo.equals("no")){
			addCards3();
			return null;
		} else {
			Scanner set = new Scanner(System.in);
			System.out.println("Which 3 cards make a set?");
			int x1 = set.nextInt();
			int x2 = set.nextInt();
			int x3 = set.nextInt();
            String dummy = set.nextLine();
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

		}
	}
}
