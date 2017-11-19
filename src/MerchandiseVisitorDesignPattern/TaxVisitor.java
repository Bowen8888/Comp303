package MerchandiseVisitorDesignPattern;

public class TaxVisitor implements MerchandiseVisitor
{

	@Override
	public void visit(Necessity pNecessity) {
		System.out.println(pNecessity.name() +":" + pNecessity.getPrice());
		
	}

	@Override
	public void visit(Tabacco pTabacco) {
		System.out.println(pTabacco.name() +":" + pTabacco.getPrice()*1.1);
		
	}

	@Override
	public void visit(Liquor pLiquor) {
		System.out.println(pLiquor.name() +":" + pLiquor.getPrice()*1.15);		
	}

}
