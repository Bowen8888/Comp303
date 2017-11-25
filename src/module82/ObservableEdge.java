package module82;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableEdge extends AbstractEdge
{
	private List<EdgeObserver> aObservers = new ArrayList<>();
	
	protected final void add(EdgeObserver pObserver)
	{
		assert pObserver != null;
		aObservers.add(pObserver);
	}
	/**
	 * 
	 */
	protected void notifyObservers()
	{
		for( EdgeObserver observer : aObservers )
		{
			observer.edgeChanged();
		}
	}

	@Override
	public final void connect(Node pStart, Node pEnd)
	{
		super.connect(pStart, pEnd);
		notifyObservers();
	}
}
