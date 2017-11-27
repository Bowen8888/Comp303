package FileSystemVisitorDesignPattern;

import java.util.Arrays;
import java.util.Iterator;



public class File extends AbstractFile
{
	public File(String pName) {
		super(pName);
	}

	@Override
	public Iterator<IFile> iterator() {
		
		return Arrays.asList(new IFile[] {this}).iterator();
	}

	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitFile(this);
		
	}

}
