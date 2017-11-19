package module8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractUnit implements Unit
{
	private static final String TAB = "   ";
	
	private final String aName;
	private final List<Unit> aUnits = new ArrayList<>();
	
	protected AbstractUnit( String pName )
	{
		aName = pName;
	}
	
	public String name()
	{
		return aName;
	}
	
	public void add(Unit pUnit)
	{
		aUnits.add(pUnit);
	}
	
	@Override
	public Iterator<Unit> iterator()
	{
		return aUnits.iterator();
	}
	
	@Override
	public void print(String pPrefix)
	{
		for( Unit unit : aUnits )
		{
			unit.print(pPrefix + TAB);
		}
	}
}
