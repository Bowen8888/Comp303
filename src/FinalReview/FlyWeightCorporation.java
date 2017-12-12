package FinalReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class FlyWeightCorporation implements Iterable<Inventory>
{
	private static Map<String, FlyWeightCorporation> aCorporations = new HashMap<String, FlyWeightCorporation>();
	private String aName;
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	private FlyWeightCorporation(String pName){
		aName = pName;
	}
	
	
	public static FlyWeightCorporation getCorporation(String pName){
		if (!aCorporations.containsKey(pName)){
			FlyWeightCorporation corporation = new FlyWeightCorporation(pName);
			aCorporations.put(pName, corporation);
			return corporation;
		}
		return aCorporations.get(pName);
		
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
