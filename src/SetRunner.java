
public class SetRunner {

	public static void main(String[] args)
	{

		boolean testingMode = true;
		if (testingMode)
		{
			System.out.println("Start tests");
			// enter test code here.
			Card c0 = new Card(0, 1, 0, 0);
			System.out.println(c0);
			Deck cp1 = new Deck();
			System.out.println(cp1);

			System.out.println("End tests");
		}
		else
		{
			Referee ref = new Referee();
			System.out.println("Start game");
			ref.playGame();
			System.out.println("End game");
		}
		
	}
}
