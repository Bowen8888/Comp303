package Bridge;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

/**
 * To be completed.
 *
 */
public class CompositeIcon implements Icon
{
	private List<Icon> aIcons = new ArrayList<>();
	private int aShift;
	
	public CompositeIcon(int pShift, Icon... pIcons)
	{
		aShift = pShift;
		int pos = -aShift;
		for(Icon icon: pIcons)
		{
			aIcons.add(new ShiftedIcon(icon,aShift+pos,0));
			pos += icon.getIconWidth()-aShift;
		}
	}

	public CompositeIcon(int pShift, List<Icon> pIcons)
	{
		aShift = pShift;
		int pos = -aShift;
		for(Icon icon: pIcons)
		{
			aIcons.add(new ShiftedIcon(icon,aShift+pos,0));
			pos += icon.getIconWidth()-aShift;
		}
	}
	
	@Override
	public int getIconHeight()
	{
		int height = 0;
		for(Icon icon: aIcons)
		{
			if(height<icon.getIconHeight())
			{
				height = icon.getIconHeight();
			}
		}
		return aIcons.get(aIcons.size()-1).getIconHeight();
	}

	@Override
	public int getIconWidth()
	{
		
		return aIcons.get(aIcons.size()-1).getIconWidth();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		for(Icon icon: aIcons)
		{
			icon.paintIcon(c, g, x, y);
		}
		
	}
	
}
