package Inheritance;

public class Client {
	public static void main(String[] pArgs)
	{
		Employee bob = new Programmer("Bob", 1000);
		Employee alice = new Manager("Alice", 2000, 500);
		
		printSalary(bob);
		printSalary(alice);
	}
	
	private static void printSalary( Employee e)
	{
		System.out.println(e.getName() + ";" + e.getSalary());
	}
}
