package MerchandiseVisitorDesignPattern;

public abstract class AbstractMerchandise implements Merchandise
{
	private double aPrice;
	private String aName;
	protected AbstractMerchandise(String pName, double pPrice)
	{
		aPrice = pPrice;
		aName = pName;
	}
	@Override
	public double getPrice()
	{
		return aPrice;
	}
	
	@Override
	public String name()
	{
		return aName;
	}
}
