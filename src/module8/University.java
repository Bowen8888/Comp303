package module8;

public class University extends AbstractUnit
{	
	private final String aPrincipal;
	
	public University(String pName, String pPrincipal)
	{
		super(pName);
		aPrincipal = pPrincipal;
	}
	
	public String getPrincipal()
	{
		return aPrincipal;
	}
	
	@Override
	public void print(String pPrefix)
	{
		System.out.println(String.format("%s%s (%s)", pPrefix, name(), aPrincipal));
		super.print(pPrefix);
	}
	
	@Override
	public void accept(UnitVisitor pVisitor)
	{
		pVisitor.visitUniversity(this);
	}
}
