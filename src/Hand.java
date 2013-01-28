
import java.util.ArrayList;
public class Hand
{
	ArrayList<Card> myHand = new ArrayList<Card>();
	public Hand()
	{
		this.myHand = myHand;
	}
	
	public void removeCard(Card theCard)
	{
		for(int i = 0; i < myHand.size(); i++)
		{
			if(myHand.get(i).getSuit() == theCard.getSuit())
			{
				if(myHand.get(i).getRank() == theCard.getRank())
				{
					myHand.remove(i);
				}
			}
		}
	}
	
	public void addCard(Card theCard)
	{
		myHand.add(theCard);
	}
	
	public void findCard(int theCard) //MUST RETURN TYPE CARD....
	{
		myHand.indexOf(theCard);
	}
	
	private int checkSet()
	{
		//Loops through all cards and checks if there is a set of 4
		return -1;
	}
	
	public String toString()
	{
		return "-1";
	}
	
	public int countCards()
	{
		return -1;
	}
}
