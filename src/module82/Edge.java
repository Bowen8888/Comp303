package module82;

public interface Edge
{
	Node getStart();
	Node getEnd();
	void connect(Node pStart, Node pEnd);
}
