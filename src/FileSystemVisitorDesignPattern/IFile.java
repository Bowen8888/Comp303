package FileSystemVisitorDesignPattern;

public interface IFile extends Iterable<IFile>, Visitable
{
	public String getName();
}
