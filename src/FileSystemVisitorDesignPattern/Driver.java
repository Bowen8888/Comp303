package FileSystemVisitorDesignPattern;



public class Driver {

	public static void main(String[] args) {
		File file1 = new File("file1");
		File file2 = new File("file2");
		Directory rootDirectory = new Directory("rootDirectory");
		SymLink subSymLink = new SymLink("subSymLink");
		subSymLink.addIFile(file2);
		rootDirectory.addIFile(file1);
		rootDirectory.addIFile(subSymLink);
		PrintVisitor v = new PrintVisitor();
		rootDirectory.accept(v);

	}

}
