package FinalReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import FinalReview.Card.Rank;
import FinalReview.Card.Suit;

public class Hand implements Iterable<Card>, Comparable<Hand>, Cloneable
{
	private List<Card> aCards = new ArrayList<>();
	private final int aMax;
	
	public Hand clone(){
		try {
			Hand clone = (Hand) super.clone();
			clone.aCards = new ArrayList<>();
			for(Card card: aCards){
				clone.aCards.add(card);
			}
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public Hand(int pMax){
		assert pMax > 0;
		aMax = pMax;
	}
	
	public void add(Card pCard){
		assert pCard!=null;
		assert !isFull();
		aCards.add(pCard);
	}
	
	public boolean isEmpty(){
		return aCards.isEmpty();
	}
	
	public void remove(Card pCard){
		assert pCard != null;
		assert !contains(pCard);
		aCards.remove(pCard);
	}
	
	public boolean contains(Card pCard){
		assert pCard != null;
		return aCards.contains(pCard);
	}
	
	public int size()
	{
		return aCards.size();
	}
	
	public boolean isFull()
	{
		return aMax == size();
	}

	@Override
	public Iterator<Card> iterator() {
		return aCards.iterator();
	}

	@Override
	public int compareTo(Hand pHand) {
		return aMax - pHand.aMax;
	}
	
	public String toString()
	{
		return "" + aMax;
	}
	
	public static Comparator<Hand> compareByRank(Rank pRank){
		return new Comparator<Hand>(){

			@Override
			public int compare(Hand pHand1, Hand pHand2) {
				
				return countRank(pHand2) - countRank(pHand1);
			}
			
			private int countRank(Hand pHand){
				int total = 0;
				for(Card card: pHand){
					if(card.getRank() == pRank){
						total++;
					}
				}
				return total;
			}
			
		};
	}

	public static Comparator<Hand> compareBySuit(Suit pSuit){
		return new Comparator<Hand>(){

			@Override
			public int compare(Hand pHand1, Hand pHand2) {
				
				return countSuit(pHand2) - countSuit(pHand1);
			}
			
			private int countSuit(Hand pHand){
				int total = 0;
				for(Card card: pHand){
					if(card.getSuit() == pSuit){
						total++;
					}
				}
				return total;
			}
			
		};
	}

}
