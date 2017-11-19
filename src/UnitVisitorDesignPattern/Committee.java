package UnitVisitorDesignPattern;

public class Committee extends AbstractUnit
{
	public Committee(String pName)
	{
		super(pName);
	}
	
	@Override
	public void print(String pPrefix)
	{
		System.out.println(String.format("%s%s", pPrefix, name()));
		super.print(pPrefix);
	}

	@Override
	public void accept(UnitVisitor pVisitor)
	{
		pVisitor.visitCommittee(this);
	}
	
	
}
