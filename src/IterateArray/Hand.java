package IterateArray;

import java.util.Comparator;
import java.util.Iterator;

import FinalReview.Card;
import FinalReview.Card.Rank;
/**
 * 
 * Q1 from practice midterm
 *
 */
public class Hand implements Iterable<Card>
{
	private Card[] aCards = new Card[10];
	
	public static Comparator<Hand> RankComparator(Rank pRank){
		return new Comparator<Hand>(){
			@Override
			public int compare(Hand pHand1,Hand pHand2){
				return countRank(pHand2) - countRank(pHand1);
			}
			
			private int countRank(Hand pHand){
				int total = 0;
				for(Card card: pHand){
					if(card.getRank() == pRank)
					{
						total ++;
					}
				}
				return total;
			}
		};
	}
	
	@Override
	public Iterator<Card> iterator() {
		
		return new Iterator<Card>(){
			int position = 0;
			
			@Override
			public boolean hasNext(){
				return aCards.length > position;
			}
			
			@Override
			public Card next(){
				return aCards[position++];
			}
		};
	}

}
