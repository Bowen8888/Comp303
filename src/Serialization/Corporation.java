package Serialization;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation implements Iterable<Inventory>, Serializable
{
	private String aName;
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	public Corporation(){
		
	}
	
	
	public Corporation(String pName){
		aName = pName;
	}
	
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
	
	public void setInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
	
	public Inventory getInventory(String pKey)
	{
		return aInventories.get(pKey);
	}
	
	public Iterator<String> getInventoryNames()
	{
		return aInventories.keySet().iterator();
	}
	
	@Override
	public Iterator<Inventory> iterator()
	{
		return aInventories.values().iterator();
	}
	
	@Override
	public String toString(){
		return "" + aInventories;
	}
	
	public String getName(){
		return aName;
	}
	
	public void setName(String pName){
		aName = pName;
	}
}
