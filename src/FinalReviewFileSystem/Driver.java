package FinalReviewFileSystem;

public class Driver {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		Directory sub1 = new Directory("sub1");
		Directory sub2 = new Directory("sub2");
		File file1 = new File("File1");
		File file2 = new File("File2");
		File file3 = new File("File3");
		File file4 = new File("File4");
		
		sub2.addFile(file1);
		sub2.addFile(file2);
		sub1.addFile(file3);
		sub1.addFile(sub2);
		root.addFile(file4);
		root.addFile(sub1);
		
		PrintVisitor pv = new PrintVisitor();
		root.accept(pv);
	}

	

}
