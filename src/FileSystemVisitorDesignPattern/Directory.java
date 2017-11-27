package FileSystemVisitorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends AbstractFile
{
	private List<IFile> aFiles = new ArrayList<>();
	
	public Directory(String pName) {
		super(pName);
	}
	
	public void addIFile(IFile pIFile)
	{
		aFiles.add(pIFile);
	}

	@Override
	public Iterator<IFile> iterator() {
		return aFiles.iterator();
	}

	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitDirectory(this);
	}

	
}
