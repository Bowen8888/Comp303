package FinalReview;

public class MultiDeck 
{
	private Deck[] aDecks ;
	
	public MultiDeck(int numDecks){
		aDecks = new Deck[numDecks];
		for(int i=0; i<numDecks; i++){
			Deck deck = new Deck();
			deck.shuffle();
			aDecks[i] = deck;
		}
	}
	
	public boolean isEmpty()
	{
		for(Deck deck: aDecks){
			if(deck.size() == 0){
				return true;
			}
		}
		
		return true;
	}
	
	public Card draw()
	{
		for(Deck deck: aDecks){
			if(deck.size() > 0){
				return deck.draw();
			}
		}
		assert false; 
		return null;
	}
}
