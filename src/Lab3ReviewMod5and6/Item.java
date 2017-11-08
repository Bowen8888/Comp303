package Lab3ReviewMod5and6;

public interface Item{
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	
	
	/**
	 * @return The name of the item
	 */
	public String getName();
	/**
	 * @return The ID of the item.
	 */
	public int getId();
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice();
	
	default boolean isBroken(){
		return false;
	}
}
