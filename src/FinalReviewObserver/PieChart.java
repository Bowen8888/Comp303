package FinalReviewObserver;

public class PieChart implements RemovalObserver,AdditionObserver
{

	@Override
	public void itemAdded(Item pItem) {
		System.out.println(pItem + " Added to PieChart");
		
	}

	@Override
	public void itemRemoved(Item pItem) {
		System.out.println(pItem + " Removed from PieChart");		
	}

}
