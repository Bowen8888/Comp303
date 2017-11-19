package module8;

public class DefaultVisitor implements UnitVisitor
{

	@Override
	public void visitUniversity(University pUniversity)
	{
		for( Unit unit : pUniversity )
		{
			unit.accept(this);
		}
	}

	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		for( Unit unit : pFaculty )
		{
			unit.accept(this);
		}
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		for( Unit unit : pDepartment )
		{
			unit.accept(this);
		}	
		}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		for( Unit unit : pCommittee )
		{
			unit.accept(this);
		}	
	}

}
