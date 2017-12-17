package FinalReviewFileSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends AbstractFile implements Iterable<IFile>
{
	private List<IFile> aIFiles = new ArrayList<IFile>();

	public Directory(String pName) {
		super(pName);
	}
	public Iterator<IFile> iterator(){
		return aIFiles.iterator();
	}
	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitDirectory(this);
		
	}
	
	public void addFile(IFile file){
		aIFiles.add(file);
	}
}
