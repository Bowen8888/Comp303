package Bridge;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

import org.junit.Test;

public class TestBridge {
	@Test
	public void testgetIconHeight()
	{
		class StubIcon implements Icon
		{

			@Override
			public void paintIcon(Component c, Graphics g, int x, int y) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getIconWidth() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getIconHeight() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}
	}
}
