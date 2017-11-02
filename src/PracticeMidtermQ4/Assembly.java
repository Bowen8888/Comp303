package PracticeMidtermQ4;

import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part
{
	private List<Part> aParts = new ArrayList<>();
	
	public Assembly(Part... pParts)
	{
		for(Part part: pParts)
		{
			aParts.add(part);
		}
	}
	
	@Override
	public void move(int x, int y) {
		for(Part part: aParts)
		{
			part.move(x, y);
		}
		
	}

}
