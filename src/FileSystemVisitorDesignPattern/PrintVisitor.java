package FileSystemVisitorDesignPattern;

public class PrintVisitor extends DefaultVisitor
{

	@Override
	public void visitFile(File pFile) {
		System.out.println(pFile.getName());
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		System.out.println(pDirectory.getName());
		super.visitDirectory(pDirectory);
		
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		System.out.println(pSymLink.getName());
		super.visitSymLink(pSymLink);
		
	}

}
