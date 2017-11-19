package UnitVisitorDesignPattern;

public class Department extends AbstractUnit
{
	private final String aChair;
	
	public Department(String pName, String pChair)
	{
		super(pName);
		aChair = pChair;
	}
	
	public String getChair()
	{
		return aChair;
	}
	
	@Override
	public void print(String pPrefix)
	{
		System.out.println(String.format("%s%s (%s)", pPrefix, name(), aChair));
		super.print(pPrefix);
	}

	@Override
	public void accept(UnitVisitor pVisitor)
	{
		pVisitor.visitDepartment(this);
	}
}
