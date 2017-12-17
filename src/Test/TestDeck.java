package Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class TestDeck 
{
	private Deck deck = new Deck();
	private Field field ;
	@Before
	public void setup() throws NoSuchFieldException, SecurityException{
		deck.shuffle();
		field = Deck.class.getDeclaredField("aCards");
		field.setAccessible(true);
	}
	
	@Test
	public void testEmpty() throws IllegalArgumentException, IllegalAccessException{
		Stack<Card> pCards = (Stack<Card>)field.get(deck);
		assertEquals(pCards.isEmpty(),deck.isEmpty());
		deck.clear();
		assertEquals(pCards.isEmpty(),deck.isEmpty());
	}
}
