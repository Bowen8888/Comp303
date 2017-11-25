package BikerCourierCompany;

import java.util.ArrayList;
import java.util.List;

public class Scheduler 
{
	private List<Observer> aObservers = new ArrayList<>();
	
	public void schedule(Biker pBiker, Algorithm pAlgorithm)
	{
		pAlgorithm.assignWorkingHour(pBiker);
		notifyObservers(pBiker);
	}
	
	public void notifyObservers(Biker pBiker)
	{
		for(Observer observer: aObservers)
		{
			observer.bikerScheduled(pBiker);
		}
	}
	
	public void addObserver(Observer pObserver)
	{
		aObservers.add(pObserver);
	}
}
