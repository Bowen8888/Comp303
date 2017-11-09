package theater;

import java.util.Arrays;
import java.util.Iterator;

public class Movie implements Show
{
	private String aTitle;
	private int aYear;
	private int aRunningTime;
	
	public Movie(String pTitle, int pYear, int pTime)
	{
		aTitle = pTitle;
		aYear = pYear;
		aRunningTime = pTime;
	}

	public Movie clone()
	{
		try {
			return (Movie) super.clone();//cannot do new Movie
		} catch (CloneNotSupportedException e) {
			return null;
		} 
	}
	
	@Override
	public String description() {
		return String.format( "%s,(%d)", aTitle, aYear);
	}
	

	@Override
	public int runningTime() {
		return aRunningTime;
	}

	@Override
	public Iterator<Movie> iterator() {
		return Arrays.asList(new Movie[] {this}).iterator();
	}
	
	
}
