package module82;

import java.util.function.Supplier;

public class AggregationEdge extends ObservableEdge
{
	private String aLabel = "";
	
	public AggregationEdge()
	{
		add( new EdgeView(new Supplier<String>()
		{
			
			@Override
			public String get()
			{
				return getLabel();
			}
		}));
	}
	
	public void setLabel(String pLabel)
	{
		aLabel = pLabel;
		super.notifyObservers();
	}
	
	public String getLabel()
	{
		return aLabel;
	}
}
