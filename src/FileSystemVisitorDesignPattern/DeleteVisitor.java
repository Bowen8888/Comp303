package FileSystemVisitorDesignPattern;

public class DeleteVisitor extends DefaultVisitor
{
	private String aQuery;
	
	
	public DeleteVisitor(String pQuery)
	{
		aQuery = pQuery;
	}
	
	@Override
	public void visitFile(File pFile) {
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		if(pDirectory.getName().equals(aQuery))
		{
			pDirectory.clear();
		}
		else
		{
			pDirectory.removeIFile(aQuery);
			super.visitDirectory(pDirectory);
		}
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		if(pSymLink.getName().equals(aQuery))
		{
			pSymLink.clear();
		}
		else
		{
			pSymLink.removeIFile(aQuery);
			super.visitSymLink(pSymLink);
		}
		
	}
	
	
	

}
