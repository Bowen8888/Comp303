package FileSystemVisitorDesignPattern;

import java.util.Iterator;

public class HiddenDirectoryDecorator implements IFile
{

	private Directory aDirectory;
	
	public HiddenDirectoryDecorator(Directory pDirectory)
	{
		aDirectory = pDirectory;
	}
	
	@Override
	public Iterator<IFile> iterator() {
		
		return aDirectory.iterator();
	}

	@Override
	public void accept(Visitor pVisitor) {
		
		pVisitor.visitDirectory(aDirectory);
	}

	@Override
	public String getName() {
		
		return "." + aDirectory.getName();
	}

}
