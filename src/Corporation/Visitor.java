package Corporation;

public interface Visitor 
{
	void visitCorporation(Corporation pCorporation);
	void visitInventory(Inventory pInventory);
	void visitItem(Item pItem);
}
