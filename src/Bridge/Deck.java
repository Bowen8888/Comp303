package Bridge;


import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

import Bridge.Card.Rank;
import Bridge.Card.Suit;

/**
 * A deck of cards.
 */
public class Deck implements Cloneable, Iterable<Card>
{
	private Stack<Card> aCards;
	
	/**
	 * Creates an empty deck.
	 */ 
	public Deck()
	{
		aCards = new Stack<Card>();
	}
	
	
	/**
	 * Resets the deck with all 52 cards and shuffles it. 
	 */
	public void shuffle()
	{
		aCards.clear();
		for( Suit suit : Suit.values() )
		{
			for( Rank rank : Rank.values())
			{
				aCards.push(new Card(rank, suit));
			}
		}
		Collections.shuffle(aCards);
	}
	
	/**
	 * @return True if there are no cards in the deck.
	 */
	public boolean isEmpty()
	{
		return aCards.isEmpty();
	}
	
	/**
	 * @return The top card in the deck.
	 * @pre !isEmpty()
	 */
	public Card draw()
	{
		assert !isEmpty();
		return aCards.pop();
	}
	@Override
	public Deck clone()
	{
		try {
			Deck clone = (Deck) super.clone();
			clone.aCards = new Stack<Card>();
			for(Card card: aCards)
			{
				clone.aCards.push(card.clone());
			}
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
		
	}

	public void clear()
	{
		aCards.clear();
	}
	
	public void add(Card pCard)
	{
		aCards.push(pCard);
	}

	@Override
	public Iterator<Card> iterator() {
		return aCards.iterator();
	}
	
	public void sort()
	{
		Collections.sort(aCards);;
	}


	
}
