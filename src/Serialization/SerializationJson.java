package Serialization;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import com.google.gson.Gson;


public class SerializationJson {
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
		
		writeGSON(igas);
	}
	
	private static void writeGSON(Corporation[] corps) throws IOException
	{
		Gson gson = new Gson();
		try( PrintWriter out = new PrintWriter(new FileWriter("products-g.json")))
		{
			out.write(gson.toJson(corps));
		}
	}
}
