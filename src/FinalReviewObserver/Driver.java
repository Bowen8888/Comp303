package FinalReviewObserver;


public class Driver {
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		PieChart o1 = new PieChart();
		ListView o2 = new ListView();
		TransactionLogger o3 = new TransactionLogger();
		
		inventory.addAdditionObserver(o1);
		inventory.addAdditionObserver(o2);
		inventory.addAdditionObserver(o3);
		inventory.addRemovalObserver(o1);
		inventory.addRemovalObserver(o2);
		for( Item item : ITEMS )
		{
			inventory.addItem(item);
		}
		
		
		for( Item item : ITEMS )
		{
			inventory.removeItem(item);
		}
	}

}
