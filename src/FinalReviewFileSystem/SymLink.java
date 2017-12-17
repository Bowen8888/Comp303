package FinalReviewFileSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SymLink implements IFile, Iterable<IFile>
{
	private List<IFile> aIFiles = new ArrayList<IFile>();
	private String aName;
	
	public SymLink(String pName){
		aName = pName;
	}

	@Override
	public String getName() {
		return aName;
	}
	
	public Iterator<IFile> iterator(){
		return aIFiles.iterator();
	}

	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitSymLink(this);
		for(IFile file: this){
			file.accept(pVisitor);
			
		}
	}
	
	public void addFile(IFile file){
		aIFiles.add(file);
	}
}
