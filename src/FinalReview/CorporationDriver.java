package FinalReview;

import java.util.Random;



public class CorporationDriver {
	private static final int MAX_STOCK = 50;
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };

	public static void main(String[] args) {
		FlyWeightCorporation iga = FlyWeightCorporation.getCorporation("iga");
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
		iga.addInventory(inventory1);
		iga.addInventory(inventory2);
		iga.addInventory(inventory3);
		/*
		for(Inventory inventory: iga){
			for(Item item : inventory){
				System.out.println(item);
			}
		}*/
		
		SingletonCorporation maxi = SingletonCorporation.getCorporation();
		maxi.addInventory(inventory1);
		maxi.addInventory(inventory2);
		maxi.addInventory(inventory3);
		
		SingletonCorporation alsoMaxi = SingletonCorporation.getCorporation();
		
		for(Inventory inventory: alsoMaxi){
			for(Item item : inventory){
				System.out.println(item);
			}
		}
	}

}
