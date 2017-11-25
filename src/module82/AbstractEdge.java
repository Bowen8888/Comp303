package module82;

public abstract class AbstractEdge implements Edge
{
	private Node aStart;
	private Node aEnd;
	
	@Override
	public Node getStart()
	{
		return aStart;
	}

	@Override
	public Node getEnd()
	{
		return aEnd;
	}

	@Override
	public void connect(Node pStart, Node pEnd)
	{
		aStart = pStart;
		aEnd = pEnd;
	}

}
