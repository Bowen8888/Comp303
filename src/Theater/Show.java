package Theater;



public interface Show extends Iterable<Movie>, Cloneable
{
	String description();
	int runningTime();
	default boolean isNull() {return false;}
	Show clone();
	
}
