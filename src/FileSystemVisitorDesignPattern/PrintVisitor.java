package FileSystemVisitorDesignPattern;

public class PrintVisitor implements Visitor
{

	@Override
	public void visitFile(File pFile) {
		System.out.println(pFile.getName());
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		System.out.println(pDirectory.getName());
		for(IFile pFile: pDirectory)
		{
			pFile.accept(this);
		}
		
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		System.out.println(pSymLink.getName());
		for(IFile pFile: pSymLink)
		{
			
			pFile.accept(this);
		}
		
	}

}
