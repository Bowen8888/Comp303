package Theater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeShow implements Show
{
	private String aName;
	List<Show> aShows = new ArrayList<>();
	
	public CompositeShow(String pName, Show...pShows)
	{
		aName = pName;
		for (Show show: pShows){
			aShows.add(show);
		}
	}
	
	
	public CompositeShow clone()
	{
		try {
			CompositeShow clone = (CompositeShow) super.clone();
			
			clone.aShows = new ArrayList<>();
			for(Show show: aShows)
			{
				clone.aShows.add(show.clone());
			}
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String description()
	{
		StringBuilder builder = new StringBuilder(); 
		builder.append("[Show: " + aName);
		for(Show show: aShows)
		{
			builder.append(show.description());
		}
		builder.append("]");
		return builder.toString();
		
	}
	
	
	public int runningTime()
	{
		int total= 0;
		
		for (Show show: aShows)
		{
			total += show.runningTime(); 
		}
		return total;
	}

	@Override
	public Iterator<Movie> iterator() {
		List<Movie> movies = new ArrayList<>();
		for (Show show: aShows)
		{
			for(Movie movie : show)
			{
				movies.add(movie);
			}
		}
		return movies.iterator();
	}
}
