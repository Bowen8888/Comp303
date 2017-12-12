package FinalReview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class SingletonCorporation implements Iterable<Inventory>
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	private static final SingletonCorporation INSTANCE = new SingletonCorporation();
	
	private SingletonCorporation(){
		
	}
	
	public static SingletonCorporation getCorporation(){
		return INSTANCE;
	}
	
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}

	@Override
	public Iterator<Inventory> iterator()
	{
		return aInventories.values().iterator();
	}

}
