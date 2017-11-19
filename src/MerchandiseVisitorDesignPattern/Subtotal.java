package MerchandiseVisitorDesignPattern;

public class Subtotal 
{
	public static void main(String[] pArgs)
	{
		Necessity milk = new Necessity("Milk",2.5);
		Tabacco cigar = new Tabacco("Cigar",25.99);
		Liquor vodka = new Liquor("Vodka",13.99);
		TaxVisitor visitor = new TaxVisitor();
		milk.accept(visitor);
		cigar.accept(visitor);
		vodka.accept(visitor);
	}
}
