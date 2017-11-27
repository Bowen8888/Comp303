package FileSystemVisitorDesignPattern;

public class HiddenDirectory extends Directory
{
	public HiddenDirectory(String pName) {
		super(pName);
	}

	@Override
	public String getName() {
		return "." + super.getName();
	}
}
