package FinalReviewObserver;

public class ListView implements RemovalObserver,AdditionObserver
{

	@Override
	public void itemAdded(Item pItem) {
		System.out.println(pItem + " Added to ListView");
		
	}

	@Override
	public void itemRemoved(Item pItem) {
		System.out.println(pItem + " Removed from ListView");		
	}

}
