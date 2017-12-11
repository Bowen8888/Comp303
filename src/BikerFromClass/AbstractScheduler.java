package BikerFromClass;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractScheduler 
{
	private List<Biker> aBikers = new ArrayList<>();
	private List<SchedulerObserver> aObservers = new ArrayList<>();
	
	public final Biker shedule(Location pLocation) throws NotAvailableException 
	{
		if(checkIfAvailable())
		{
			throw new NotAvailableException();
		}
		
		Biker myBiker = actualSchedule(pLocation);
		notifyObservers(myBiker,pLocation);
		
		
		return null;
	}
	
	public boolean checkIfAvailable()
	{
		return false;
	}
	
	public void notifyObservers(Biker pBiker, Location pLocation){
		
	}
	
	
	public void addObservers(SchedulerObserver pObserver)
	{
		aObservers.add(pObserver);
	}
	
	protected Biker actualSchedule(Location pLocation)
	{
		return null;
	}
	
}
