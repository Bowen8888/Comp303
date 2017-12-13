package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;




public class SerializationBinary {

	private static final int MAX_STOCK = 50;
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	
	
	/**
	 * @param pArgs Not used
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] pArgs) throws IOException, ClassNotFoundException
	{
		Random random = new Random();
		Inventory inventory1 = new Inventory("IGA Location 1");
		Inventory inventory2 = new Inventory("IGA Location 2");
		Inventory inventory3 = new Inventory("IGA Location 3");
		for( Item item : ITEMS )
		{
			inventory1.stock(item, random.nextInt(MAX_STOCK));
			inventory2.stock(item, random.nextInt(MAX_STOCK));
			inventory3.stock(item, random.nextInt(MAX_STOCK));
		}
		Corporation iga = new Corporation("iga");
		iga.addInventory(inventory1);
		iga.addInventory(inventory2);
		iga.addInventory(inventory3);
		
		Corporation[] igas = new Corporation[1];
		igas[0] = iga;
		print(igas);
		
		write(igas);
		read();
		print(igas);

	}
	
	public static void print(Corporation[] corps){
		for(Corporation corp: corps){
			System.out.println(corp);
		}
	}
	private static void write(Corporation[] corps) throws IOException
	{
		try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("corporations.dat")))
		{
			out.writeObject(corps);
		}
	}
	
	private static Corporation[] read() throws IOException, ClassNotFoundException
	{
		try( ObjectInputStream in = new ObjectInputStream(new FileInputStream("corporations.dat")))
		{
			return (Corporation[])in.readObject();
		}
	}

}
