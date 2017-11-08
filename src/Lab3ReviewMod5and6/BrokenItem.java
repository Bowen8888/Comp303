package Lab3ReviewMod5and6;

public class BrokenItem implements Item
{
	private Item aItem;
	@Override
	public String getName() {
		return "Bad "+aItem.getName();
	}

	@Override
	public int getId() {
		return aItem.getId();
	}

	@Override
	public int getPrice() {
		return aItem.getPrice()/2;
	}
	
	public boolean isBroken()
	{
		return true;
		
	}

}
