package Serialization;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class SerializationXML {
	private static final int MAX_STOCK = 50;
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	protected static final String FILE_NAME = "corporation.xml";
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
		
		Chanel chanel = new Chanel();
		VideoClips v1 = new VideoClips("v1");
		VideoClips v2 = new VideoClips("v2");
		chanel.add(v1);
		chanel.add(v2);
		
		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(FILE_NAME)));
		encoder.writeObject(chanel);
		encoder.close();
		
		XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(FILE_NAME)));
		Chanel chanel2 = (Chanel) decoder.readObject();
		for(VideoClips v: chanel2){
			System.out.println(v);
		}
		decoder.close();
	}
	
	
}
