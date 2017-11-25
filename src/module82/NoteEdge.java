package module82;

import java.util.function.Supplier;

public class NoteEdge extends ObservableEdge
{
	public NoteEdge()
	{
		add(new EdgeView(new Supplier<String>()
		{
			
			@Override
			public String get()
			{
				return "";
			}
		}));
	}
}
