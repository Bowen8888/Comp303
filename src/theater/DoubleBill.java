package theater;

import java.util.Arrays;
import java.util.Iterator;

public class DoubleBill implements Show
{
	private Movie aMovie1;
	private Movie aMovie2;
	
	@Override
	public Iterator<Movie> iterator() {
		return Arrays.asList(new Movie[] {aMovie1,aMovie2}).iterator();
	}
	
	
	public DoubleBill clone()
	{
		
		try {
			DoubleBill clone = (DoubleBill) super.clone();
			clone.aMovie1 = aMovie1.clone();
			clone.aMovie2 = aMovie2.clone();
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
		
		
	}
	@Override
	public String description() {
		return String.format("%s and %s", aMovie1.description(), aMovie2.description());
	}

	@Override
	public int runningTime() {
		return aMovie1.runningTime() + aMovie2.runningTime();
	}
	
}
