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
	int [] selection;
	Deck myDeck;
	Board myBoard;

	private Scanner keyReader;
	/**
	 * constructor
	 */
	// TODO: write the Referee's constructor method.
	public Referee()
	{
		keyReader = new Scanner(System.in);
		selection = new int[3];
		myDeck = new Deck();
		myBoard = new Board();
	}
	/**
	 * playGame - the main game loop for the program.
	 */
	public void playGame() {
		// TODO: write the Referee's playGame method.
		System.out.println("Playing game."); // placeholder code
		while (!myDeck.gameOver) {
		System.out.println(myBoard);
		askUserForSets();
		checkForSet(selection);
		System.out.println(currentScore);
		}
		System.out.println("Your final score was " + currentScore);
	}

	public void addCards3()
	{
//add 3 cards to the board if the user can't find a set
		myBoard.dealThreeCardsToLocation(12, 13, 14);
	}
	public void askUserForSets()
	{

		System.out.println("Do you see a set? Type yes or no.");
		String yesOrNo = keyReader.nextLine();
		if (yesOrNo.equals("no")){
			addCards3();
		} else {
			System.out.println("Which 3 cards make a set?");
			int x1 = keyReader.nextInt();
			int x2 = keyReader.nextInt();
			int x3 = keyReader.nextInt();
            String dummy = keyReader.nextLine();
			selection = new int[]{x1, x2, x3};
		}
	}
	public void checkForSet(int [] selection) {
        int aa = selection[0];
        int bb = selection[1];
        int cc = selection[2];
		Card a = myBoard.getCardAtLoc(aa);
		Card b = myBoard.getCardAtLoc(bb);
		Card c = myBoard.getCardAtLoc(cc);
        boolean legal = false;
        if (a != b && b != c && a != c) {
			boolean iconsWork, groupsWork, backgroundsWork, colorsWork;
			iconsWork = (((a.getWhichIcon() + b.getWhichIcon() + c.getWhichIcon()) % 3) != 0);
			groupsWork = (((a.getGroupSize() + b.getGroupSize() + c.getGroupSize()) % 3) != 0);
			backgroundsWork = (((a.getWhichBackground() + b.getWhichBackground() + c.getWhichBackground()) % 3) != 0);
			colorsWork = (((a.getWhichColor() + b.getWhichColor() + c.getWhichColor()) % 3) != 0);

			if(!(iconsWork && groupsWork && backgroundsWork && colorsWork)){
				currentScore = currentScore + 3;
				legal = true;
			}
        }
		if (legal) {
			myBoard.remove3Cards(aa, bb, cc);
		}
    }
}
