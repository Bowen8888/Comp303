package PrototypeVsFactor;

import Bridge.Card;
import Bridge.Deck;

public class Driver {
	public static void main(String[] pArgs)
	{
		PrototypeOfDeck prototype = new PrototypeOfDeck();
		
		prototype.setHeartsDeck();
		Deck deck = prototype.generateDeck();
		deck.sort();
		for(Card card: deck)
		{
			System.out.println(card);
		}
		Deck clone = deck.clone();
		
		for(Card card: clone)
		{
			System.out.println(card);
		}
	}
}
