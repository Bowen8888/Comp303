package FinalReviewFileSystem;

public class PrintVisitor implements Visitor {

	@Override
	public void visitFile(File pFile) {
		System.out.println(pFile.getName());
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		for(IFile file :pSymLink ){
			file.accept(this);
		}
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		for(IFile file :pDirectory ){
			file.accept(this);
		}
	}

}
