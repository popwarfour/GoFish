
public class Card
{
	char suit;
	int rank;
	
	public Card()
	{
		suit = 'x';
		rank = -1;
	}
	
	public Card(char suit, int rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public char getSuit()
	{
		return this.suit;
	}
	
	public int getRank()
	{
		return rank;
	}
}
