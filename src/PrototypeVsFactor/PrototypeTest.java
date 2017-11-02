package PrototypeVsFactor;

public class PrototypeTest {
	private Item prototype = new Item("Test");
	
	public Item generaateNew()
	{
		return prototype.clone();
	}
	
	public Item factory()
	{
		return new Item("Test");
	}
	
	public Item factory(String pString)
	{
		return new Item(pString);
	}
	
	public void setPrototype(Item pItem)
	{
		prototype = pItem;
	}
	public class Item implements Cloneable
	{
		private final String aString;
		
		public Item (String pString)
		{
			aString = pString;
		}
		@Override
		public Item clone()
		{
			try {
				Item clone = (Item) super.clone();
				return clone;
			} catch (CloneNotSupportedException e) {
				return null;
			}
		}
	}
	
	
}
