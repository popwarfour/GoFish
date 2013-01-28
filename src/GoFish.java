public class GoFish
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Create the main deck
		Deck mainDeck = new Deck();
		
		// Create 4 Players
		Player player1 = new Player(mainDeck);
		Player player2 = new Player(mainDeck);
		Player player3 = new Player(mainDeck);
		Player player4 = new Player(mainDeck);
				
	}
}
