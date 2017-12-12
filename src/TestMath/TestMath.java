package TestMath;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestMath {
	@Test
	public void testAbs()
	{
		assertEquals(5,Math.abs(5));
		assertEquals(5,Math.abs(-5));
		assertFalse(-5 == Math.abs(-5));
	}
	
	@Test
	public void testMin()
	{
		assertEquals(Math.min(15, 5),5);
		assertEquals(Math.min(10, -10),-10);
		
	}
}
