package Bridge;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

/**
 * To be completed.
 */
public class ShiftedIcon implements Icon
{
	private int aX;
	private int aY;
	private Icon aIcon;

	public ShiftedIcon(Icon pIcon, int pX, int pY)
	{
		aX = pX;
		aY = pY;
		aIcon = pIcon;
	}
	@Override
	public int getIconHeight()
	{

		return aIcon.getIconHeight()+aY;
	}

	@Override
	public int getIconWidth()
	{
		return aIcon.getIconWidth()+aX;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		aIcon.paintIcon(c, g, x+aX, y+aY);
		
	}
}
