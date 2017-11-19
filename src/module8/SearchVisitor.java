package module8;

public class SearchVisitor extends DefaultVisitor
{
	private String aQuery;
	private Unit aResult;
	
	public SearchVisitor(String pQuery)
	{
		aQuery = pQuery;
	}
	
	public Unit getResult()
	{
		return aResult;
	}

	@Override
	public void visitUniversity(University pUniversity)
	{
		if( pUniversity.getPrincipal().equals(aQuery))
		{
			aResult = pUniversity;
		}
		else
		{
			super.visitUniversity(pUniversity);
		}
	}

	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		if( pFaculty.getDean().equals(aQuery))
		{
			aResult = pFaculty;
		}
		else
		{
			super.visitFaculty(pFaculty);
		}
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		if( pDepartment.getChair().equals(aQuery))
		{
			aResult = pDepartment;
		}
		else
		{
			super.visitDepartment(pDepartment);
		}
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		
	}
	
	
}
