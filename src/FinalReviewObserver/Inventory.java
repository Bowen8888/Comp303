package FinalReviewObserver;

import java.util.ArrayList;
import java.util.List;


public class Inventory 
{
	private List<Item> aItems = new ArrayList<>();
	private List<AdditionObserver> aAdditionObservers = new ArrayList<>();
	private List<RemovalObserver> aRemovalObservers = new ArrayList<>();

	public Inventory(){
		
	}
	
	public void addItem(Item pItem){
		aItems.add(pItem);
		notifyAdditionObserver(pItem);
	}
	
	public void removeItem(Item pItem){
		assert aItems.contains(pItem);
		aItems.remove(pItem);
		notifyRemovalObserver(pItem);
	}
	
	public void addAdditionObserver(AdditionObserver pObserver){
		aAdditionObservers.add(pObserver);
	}
	
	public void removeAdditionObserver(AdditionObserver pObserver){
		assert aAdditionObservers.contains(pObserver);
		aAdditionObservers.remove(pObserver);
	}
	
	private void notifyAdditionObserver(Item pItem){
		for(AdditionObserver observer: aAdditionObservers){
			observer.itemAdded(pItem);
		}
	}
	
	public void addRemovalObserver(RemovalObserver pObserver){
		aRemovalObservers.add(pObserver);
	}
	
	public void removeRemovalObserver(RemovalObserver pObserver){
		assert aRemovalObservers.contains(pObserver);
		aRemovalObservers.remove(pObserver);
	}
	
	private void notifyRemovalObserver(Item pItem){
		for(RemovalObserver observer: aRemovalObservers){
			observer.itemRemoved(pItem);
		}
	}
}
