package PrototypeVsFactorProtorypeDesignPattern;

public class PrototypeTest {
	private Item prototype = new Item("Test");
	
	public Item generateNew()
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
		private final String aName;
		
		public Item (String pString)
		{
			aName = pString;
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
		
		public String getName()
		{
			return aName;
		}
	}
	
	
}
