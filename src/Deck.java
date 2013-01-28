import java.util.Collections;
import java.util.Stack;

public class Deck
{
	Stack <Card> myDeck = new Stack();
	public Stack Deck()
	{
		//Add the 52 Cards
		int counter = 1;
		for(int i = 1; i <= 13; i++)
		{
			Card heartCard = new Card('h', i);
			counter++;
			myDeck.push(heartCard);
			Card spadeCard = new Card('s', i);
			counter++;
			myDeck.push(spadeCard);
			Card dimondCard = new Card('d', i);
			counter++;
			myDeck.push(dimondCard);
			Card clubCard = new Card('c', i);
			counter++;
			myDeck.push(clubCard);
		}
		//Sort the Deck
		Collections.shuffle(myDeck);
		return myDeck;
	}
	
	public void removeCard()
	{
		myDeck.pop();
	}
}
