import java.util.Arrays;

public class SetRunner {

	public static void main(String[] args)
	{

		boolean testingMode = true;
		if (testingMode)
		{
			System.out.println("Start tests");
			// enter test code here.
			Card c0 = new Card(0, 1, 0, 0);
			Card c1 = new Card(1, 1, 1, 1);
			Card c2 = new Card(2, 1, 2, 2);
			System.out.println(c0);
			Referee ref = new Referee();
			ref.playGame();
			System.out.println(Arrays.toString(ref.selection));
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
