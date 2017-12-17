package FinalReviewFileSystem;

public class File extends AbstractFile
{

	public File(String pName) {
		super(pName);
	}

	@Override
	public void accept(Visitor pVisitor) {
		pVisitor.visitFile(this);
		
	}
	
	
}
