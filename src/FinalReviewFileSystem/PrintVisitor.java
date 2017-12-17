package FinalReviewFileSystem;

public class PrintVisitor implements Visitor {

	@Override
	public void visitFile(File pFile) {
		System.out.println(pFile.getName());
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		System.out.println(pSymLink.getName() + ":");
		for(IFile file :pSymLink ){
			file.accept(this);
		}
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		System.out.println(pDirectory.getName() + ":");
		for(IFile file :pDirectory ){
			file.accept(this);
		}
	}

}
