package FinalReviewFileSystem;

public class Driver {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		Directory sub1 = new Directory("sub1");
		Directory sub2 = new Directory("sub2");
		HiddenDirectory h1 = new HiddenDirectory("h1");
		File file1 = new File("File1");
		File file2 = new File("File2");
		File file3 = new File("File3");
		File file4 = new File("File4");
		File file5 = new File("File5");
		
		
		h1.addFile(file5);
		sub2.addFile(h1);
		sub2.addFile(file4);
		sub2.addFile(file3);
		sub1.addFile(file2);
		sub1.addFile(sub2);
		root.addFile(file1);
		root.addFile(sub1);
		
		PrintVisitor pv = new PrintVisitor();
		root.accept(pv);
	}

	

}
