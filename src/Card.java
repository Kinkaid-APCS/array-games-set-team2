/**
 * the Card class represents a card in the Set game - it consists 
 * of 1-3 characters (aka icons), which come in 3 varieties. Each of the
 * groups is in one of 3 colors on one of 3 background colors. A card may not be empty.
 *
 * So each card can be represented by four numbers - which icon, how many, color, and background.
 * Each of these numbers has 3 possible values.
 * Question: how many legal combinations are there???
 */
public class Card {

	// TODO: decide which private member variables the Card class requires and declare them here.

	/**
	 * constructor - given four values, initialize the card.
	 *
	 * @param whichIcon: a number 0-2, where 0 means "*"; 1 means "o"; and 2 means "•"
	 * @param groupSize: a number 1-3
	 * @param whichColor: a number 0-2
	 * @param whichBackground: a number 0-2
	 */
	private int whichIcon;
	private int groupSize;
	private int whichColor;
	private int whichBackground;
	public static final String ANSI_RESET = "\u001B[0m";

	public int getWhichIcon() {
		return whichIcon;
	}

	public int getGroupSize() {
		return groupSize;
	}

	public int getWhichColor() {
		return whichColor;
	}

	public int getWhichBackground() {
		return whichBackground;
	}
	public Card(int inwhichIcon, int ingroupSize, int inwhichColor, int inwhichBackground) {

		{
			whichIcon = inwhichIcon;
			groupSize = ingroupSize;
			whichColor = inwhichColor;
			whichBackground = inwhichBackground;
		}


	}

		// NOTE: there are no modifiers (setters) because we
		//       don't want to ever change a card after we make it.

		public String toString(){
			String background = "";
			String color = "";
			String shape = "";
			String fin = "";
			if (whichIcon == 0){
				shape = "x";
			}
			else if (whichIcon == 1) {
				shape = "•";
			}
			else if (whichIcon == 2) {
				shape = "o";
			}
			for (int i = 1; i <= groupSize; i++){
				fin = fin.concat(shape);
			}
			if (whichColor == 0){
				color = "\u001B[32m";
			}
			else if (whichColor == 1) {
				color = "\u001B[31m";
			}
			else if (whichColor == 2) {
				color = "\u001B[35m";
			}
			if (whichBackground == 0){
				background = "\u001B[43m";
			}
			else if (whichBackground == 1) {
				background = "\u001B[44m";
			}
			else if (whichBackground == 2) {
				background = "\u001B[46m";
			}
			return color + background + fin + "\u001B[0m";
		}
		// TODO: you write the Card's toString
		// hint: see https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
		// so the string "/u001B[31mTest/u001B[0m" Prints Test in red letters.
		// and "/u001B[31m/u001B[42mTest2/u001B[0m" prints Test2 in red letters on a green background.
		//  (the /u001B[0m at the end resets the color to normal for the next thing you print.)
	}