package theater;

import java.util.ArrayList;
import java.util.Iterator;



public class NullShow implements Show
{
	public static final NullShow DEFAULT = new NullShow();
	
	public static Object INSTANCE;

	@Override
	public Iterator<Movie> iterator() {
		return new ArrayList<Movie>().iterator();
	}

	@Override
	public String description() {
		return "Nullshow";
	}

	@Override
	public int runningTime() {
		return 0;
	}

	@Override
	public NullShow clone() {
		try {
			NullShow clone = (NullShow)super.clone();
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}

	}

}
