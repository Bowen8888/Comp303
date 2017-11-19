package MerchandiseVisitorDesignPattern;

public class Liquor extends AbstractMerchandise
{

	protected Liquor(String pName, double pPrice) {
		super(pName, pPrice);
	}

	@Override
	public void accept(MerchandiseVisitor pMerchandiseVisitor) {
		pMerchandiseVisitor.visit(this);
		
	}

}