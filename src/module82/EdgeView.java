package module82;

import java.util.function.Supplier;

public class EdgeView implements EdgeObserver
{
	private Edge aEdge;
	private Supplier<String> aLabelSupplier;
	private Supplier<LineStyle> aLineStyleProvider;
	
	public EdgeView(Supplier<String> pLabelProvider)
	{
		aLabelSupplier = pLabelProvider;
	}
	
	@Override
	public void edgeChanged()
	{
		aLabelSupplier.get();
		// Compute path
		// set line style
		// draw path
		// draw arrow
		// draw label
	}
}
