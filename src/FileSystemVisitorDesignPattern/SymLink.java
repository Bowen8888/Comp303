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
	
	public void clear()
	{
		aFiles.clear();
	}
	
	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitSymLink(this);
	}
	
	public void removeIFile(String pName)
	{
		IFile file = find(pName);
		while( file!= null)
		{
			aFiles.remove(file);
			file = find(pName);
		}
		
	}
	
	private IFile find(String pName)
	{
		for(IFile file: aFiles)
		{
			if (file.getName().equals(pName))
			{
				return file;
			}
		}
		
		return null;
	}
}
