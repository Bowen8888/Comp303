package PrototypeVsFactor;

import Bridge.Card;
import Bridge.Card.Suit;
import Bridge.Deck;

public class PrototypeOfDeck {
	private static Deck aFullDeck = new Deck();
	private Deck aDeck = new Deck();
	
	static{
		aFullDeck.shuffle();
	}
	
	public void setHeartsDeck()
	{
		aDeck.clear();
		for(Card card: aFullDeck)
		{
			if(card.getSuit() == Suit.HEARTS)
			{
				aDeck.add(card);
			}
		}
	}
	
	public void setFullDeck()
	{
		aDeck = aFullDeck;
	}
	
	public Deck generateDeck()
	{
		return aDeck.clone();
	}
	
}
