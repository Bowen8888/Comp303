package FinalReviewObserver;

public class TransactionLogger implements AdditionObserver
{

	@Override
	public void itemAdded(Item pItem) {
		System.out.println(pItem + " Added to TransactionLogger");
		
	}

}
