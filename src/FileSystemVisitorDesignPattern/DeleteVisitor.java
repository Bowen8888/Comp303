package FileSystemVisitorDesignPattern;

public class DeleteVisitor implements Visitor
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
			for(IFile file: pDirectory)
			{
					file.accept(this);
				
			}
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
			for(IFile file: pSymLink)
			{
				
					file.accept(this);
				
			}
		}
		
	}
	
	
	

}
