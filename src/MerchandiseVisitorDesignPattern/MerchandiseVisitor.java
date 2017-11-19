package MerchandiseVisitorDesignPattern;

public interface MerchandiseVisitor 
{
	void visit(Necessity pNecessity);
	void visit(Tabacco pTabacco);
	void visit(Liquor pLiquor);
}
