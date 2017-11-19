package MerchandiseVisitorDesignPattern;

public class Necessity extends AbstractMerchandise
{

	protected Necessity(String pName, double pPrice) {
		super(pName, pPrice);
	}

	@Override
	public void accept(MerchandiseVisitor pMerchandiseVisitor) {
		pMerchandiseVisitor.visit(this);		
	}



}
