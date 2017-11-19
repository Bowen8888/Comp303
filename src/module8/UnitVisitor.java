package module8;

public interface UnitVisitor
{
	void visitUniversity(University pUniversity);
	void visitFaculty(Faculty pFaculty);
	void visitDepartment(Department pDepartment);
	void visitCommittee(Committee pCommittee);
}
