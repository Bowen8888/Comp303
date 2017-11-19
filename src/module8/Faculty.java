package module8;

public class Faculty extends AbstractUnit
{
	private final String aDean;
	
	public Faculty(String pName, String pDean)
	{
		super(pName);
		aDean = pDean;
	}
	
	public String getDean()
	{
		return aDean;
	}
	
	@Override
	public void print(String pPrefix)
	{
		System.out.println(String.format("%s%s (%s)", pPrefix, name(), aDean));
		super.print(pPrefix);
	}
	
	@Override
	public void accept(UnitVisitor pVisitor)
	{
		pVisitor.visitFaculty(this);
	}
}
