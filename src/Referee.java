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
	boolean isThereASet = false;
	int currentScore = 0;
	/**
	 * constructor
	 */
	// TODO: write the Referee's constructor method.
	
	/**
	 * playGame - the main game loop for the program.
	 */
	public void playGame()
	{
		// TODO: write the Referee's playGame method.

		System.out.println("Playing game."); // placeholder code
		askUserForSets();
	}
	public void addCards3()
	{
//add 3 cards to the board if the user can't find a set
	}
	public String askUserForSets()
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
			String checkSet = set.nextLine();
			return checkSet;
		}
	}
	public boolean checkForSet(String checkSet)
	{
		if (checkSet.equals(null)) {

		}
	}
}
