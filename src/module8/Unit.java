package module8;

public interface Unit extends Iterable<Unit>, Visitable
{
	String name();
	void print(String pPrefix);
}
