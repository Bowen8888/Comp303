package FileSystemVisitorDesignPattern;

public class DefaultVisitor implements Visitor
{

	@Override
	public void visitFile(File pFile) {
		
		
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		for(IFile file: pDirectory)
		{
			file.accept(this);
		}
		
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		for(IFile file: pSymLink)
		{
			file.accept(this);
		}
		
		
	}

}
