package FinalReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import FinalReview.Card.Rank;
import FinalReview.Card.Suit;

public class HandDriver {

	public static void main(String[] pArgs) {
		Hand hand1 = new Hand(3);
		Hand hand2 = new Hand(2);
		Hand hand3 = new Hand(6);
		
		hand1.add(Card.get(Rank.ACE, Suit.CLUBS));
		hand1.add(Card.get(Rank.EIGHT, Suit.CLUBS));
		hand1.add(Card.get(Rank.FIVE, Suit.CLUBS));
		
		hand2.add(Card.get(Rank.TWO, Suit.CLUBS));
		hand2.add(Card.get(Rank.EIGHT, Suit.CLUBS));
		
		hand3.add(Card.get(Rank.ACE, Suit.CLUBS));
		hand3.add(Card.get(Rank.EIGHT, Suit.DIAMONDS));
		hand3.add(Card.get(Rank.FOUR, Suit.DIAMONDS));
		hand3.add(Card.get(Rank.ACE, Suit.DIAMONDS));
		hand3.add(Card.get(Rank.FIVE, Suit.DIAMONDS));
		hand3.add(Card.get(Rank.QUEEN, Suit.DIAMONDS));
		
		
		List<Hand> hands = new ArrayList<Hand>();
		
		hands.add(hand1);
		hands.add(hand2);
		hands.add(hand3);

		for(Hand hand : hands){
			System.out.println(hand);
		}
		
		Collections.sort(hands, Hand.compareBySuit(Suit.CLUBS));
		Collections.sort(hands, Hand.compareByRank(Rank.ACE));
		for(Hand hand : hands){
			System.out.println(hand);
		}
	}

}
