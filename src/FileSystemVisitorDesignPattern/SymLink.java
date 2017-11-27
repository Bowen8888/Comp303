package FileSystemVisitorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SymLink extends AbstractFile
{

	private List<IFile> aFiles = new ArrayList<>();

	public SymLink(String pName) {
		super(pName);
	}

	@Override
	public Iterator<IFile> iterator() {
		return aFiles.iterator();
	}

	public void addIFile(File pIFile)
	{
		aFiles.add(pIFile);
	}
	
	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitSymLink(this);
	}

}
