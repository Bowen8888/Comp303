package module8;

public class PrintVisitor extends DefaultVisitor
{
	private String aPrefix = "";
	private static final String TAB = "   ";
	
	@Override
	public void visitUniversity(University pUniversity)
	{
		System.out.println(aPrefix + pUniversity.name());
		aPrefix += TAB;
		super.visitUniversity(pUniversity);
		aPrefix = aPrefix.substring(0,  aPrefix.length()-3);
	}

	@Override
	public void visitFaculty(Faculty pFaculty)
	{
		System.out.println(aPrefix + pFaculty.name());
		aPrefix += TAB;
		super.visitFaculty(pFaculty);
		aPrefix = aPrefix.substring(0,  aPrefix.length()-3);
	}

	@Override
	public void visitDepartment(Department pDepartment)
	{
		System.out.println(pDepartment.name());
		super.visitDepartment(pDepartment);

	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		System.out.println(pCommittee.name());
		super.visitCommittee(pCommittee);

	}

}
