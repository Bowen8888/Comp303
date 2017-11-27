package Corporation;

public class NormalItem implements Item
{
		private final String aName;
		private final int aId;
		private final int aPrice; // In cents: 100 = one dollar
		
		/**
		 * Creates a new item.
		 * @param pName The name of the item. Not necessarily unique.
		 * @param pId A unique id for the item
		 * @param pPrice The price of the item in cents
		 */
		public NormalItem(String pName, int pId, int pPrice)
		{
			aName = pName;
			aId = pId;
			aPrice = pPrice;
		}
		
		/**
		 * @return The name of the item
		 */
		public String getName()
		{
			return aName;
		}
		
		/**
		 * @return The ID of the item.
		 */
		public int getId()
		{
			return aId;
		}
		
		/**
		 * @return The price of the item in cents
		 */
		public int getPrice()
		{
			return aPrice;
		}

}
