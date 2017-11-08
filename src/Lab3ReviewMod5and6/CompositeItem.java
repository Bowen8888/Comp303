package Lab3ReviewMod5and6;

import java.util.ArrayList;
import java.util.List;

public class CompositeItem implements Item
{
	private List<Item> aItems = new ArrayList<>();
	private final int aId;
	private final String aName;
	public CompositeItem(String pName, int pId, Item... pItems)
	{
		for(Item item: pItems)
		{
			aItems.add(item);
		}
		
		aId = pId;
		aName = pName;
	}
	@Override
	public String getName() {
		StringBuilder name = new StringBuilder();
		name.append("[Item " + aName+" : ");
		for(Item item: aItems)
		{
			name.append(item.getName()+ " ");
		}
		name.append("]");
		return null;
	}

	@Override
	public int getId() {
		return aId;
	}

	@Override
	public int getPrice() {
		int total = 0;
		for(Item item: aItems)
		{
			total+=item.getPrice();
		}
		return total;
	}

}
