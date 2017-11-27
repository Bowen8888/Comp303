package Corporation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Represents the inventory of a 
 * physical grocery store.
 */
public class Inventory implements Iterable<Item>
{
	private final String aName; // Unique
	private final HashMap<Item, Integer> aInventory = new HashMap<>();
	private List<AdditionObserver> aAddObservers = new ArrayList<>();
	private List<RemovalObserver> aRemObservers = new ArrayList<>();
	
	public void addObserver(AdditionObserver pObserver)
	{
		aAddObservers.add(pObserver);
	}
	
	public void removeObserver(RemovalObserver pObserver)
	{
		aRemObservers.add(pObserver);
	}
	
	public void notifyAdditionObserver(Item item)
	{
		for(AdditionObserver observer: aAddObservers)
		{
			observer.itemAdded(item);
		}
	}
	
	public void notifyRemovalObserver(Item item)
	{
		for(RemovalObserver observer: aRemObservers)
		{
			observer.itemRemoved(item);
		}
	}
	
	/**
	 * Creates a new inventory with no items in it,
	 * and identified uniquely with pName.
	 * @param pName A unique identifier for this inventory.
	 */
	public Inventory(String pName)
	{
		aName = pName;
	}
	
	/**
	 * @return The unique name of this inventory.
	 */
	public String getName()
	{
		return aName;
	}
	
	
	/**
	 * Adds pQuantity number of items to the inventory.
	 * @param pItem The type of item to add.
	 * @param pQuantity The amount to add.
	 */
	public void stock(Item pItem, int pQuantity)
	{
		int amount = 0;
		if( aInventory.containsKey(pItem))
		{
			amount = aInventory.get(pItem);
		}
		amount += pQuantity;
		aInventory.put(pItem, amount);
		
		notifyAdditionObserver(pItem);
		
		
	}
	
	/**
	 * Removes pQuantity of items from the inventory,
	 * for example by selling them or tossing them in
	 * the garbage.
	 * @param pItem The type of item to dispose of
	 * @param pQuantity The amount to dispose.
	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public void dispose(Item pItem, int pQuantity)
	{
		int amount = aInventory.get(pItem);
		amount -= pQuantity;
		aInventory.put(pItem, amount);
		notifyRemovalObserver(pItem);
	}
	
	/**
	 * @param pItem The item to check for availability.
	 * @return How many of the items are available in the inventory.
	 */
	public int available(Item pItem)
	{
		if( aInventory.containsKey(pItem))
		{
			return aInventory.get(pItem);
		}
		else
		{
			return 0;
		}
	}

	@Override
	public Iterator<Item> iterator()
	{
		return aInventory.keySet().iterator();
	}
}
interface AdditionObserver{
	void itemAdded(Item aItem);
}
interface RemovalObserver{
	void itemRemoved(Item aItem);
}

class PieChart implements AdditionObserver, RemovalObserver
{

	@Override
	public void itemRemoved(Item aItem) {
		System.out.println(aItem + "removed from Piechart");
	}

	@Override
	public void itemAdded(Item aItem) {
		System.out.println(aItem + "added to Piechart");		
	}
	
}

class ListView implements AdditionObserver, RemovalObserver
{

	@Override
	public void itemRemoved(Item aItem) {
		System.out.println(aItem + "removed from ListView");		
	}

	@Override
	public void itemAdded(Item aItem) {
		System.out.println(aItem + "added to ListView");		
	}
	
}

class TransactionLogger implements AdditionObserver
{

	@Override
	public void itemAdded(Item aItem) {
		System.out.println(aItem + "added to TransactionLogger");				
	}
	
}