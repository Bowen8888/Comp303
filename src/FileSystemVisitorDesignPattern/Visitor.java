package FileSystemVisitorDesignPattern;

public interface Visitor 
{
	void visitFile(File pFile);
	void visitDirectory(Directory pDirectory);
	void visitSymLink(SymLink pSymLink);
}
