package MerchandiseVisitorDesignPattern;

public class Tabacco extends AbstractMerchandise
{

	protected Tabacco(String pName, double pPrice) {
		super(pName, pPrice);
	}

	@Override
	public void accept(MerchandiseVisitor pMerchandiseVisitor) {
		pMerchandiseVisitor.visit(this);
	}


}
