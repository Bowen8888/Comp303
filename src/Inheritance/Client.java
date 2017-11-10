package Inheritance;

public class Client {
	public static void main(String[] pArgs)
	{
		Employee bob = new Programmer("Bob", 1000);
		Employee alice = new Manager("Alice", 2000, 500);
		
		printSalary(bob);
		printSalary(alice);
		printCompensation(bob);
		printCompensation(alice);
		
		doit(bob);
		doit(alice);
		
		Manager romeo = new Manager("Romeo", 1000, 200);
		Manager neo = new Manager("Neo", 2500, 100);
		
		neo.setMentor(romeo);
		Employee alsoRomeo = romeo;
		
		neo.setMentor(alsoRomeo);
		
	}
	
	private static void printSalary( Employee e)
	{
		System.out.println(e.getName() + " with Salary of" + e.getSalary());
	}
	
	private static void printCompensation(Employee e)
	{
		System.out.println(e.getName() + " with Compensation of" + e.getCompensation());
	}
	
	public static void doit(Employee e)
	{
		System.out.println(e.toString() + e.getCompensation());
	}
}
