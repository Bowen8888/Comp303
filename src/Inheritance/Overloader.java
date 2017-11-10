package Inheritance;

public class Overloader {
	public static void main(String[] pArgs)
	{
		System.out.println(new Overloader().doit("Foo"));
		System.out.println(new Overloader().doit(12));
		System.out.println(new Overloader().doit(12.3));
		System.out.println(new Overloader().doit(new Manager("Alice",12000,2000)));
		System.out.println(new Overloader().doit(new double[10]));
		System.out.println(new Overloader().doit(Long.MAX_VALUE));
		System.out.println(new Overloader().doit(new Employee("AMO",1200)));
		
		String foo = "Foo";
		new Overloader().redirector(foo);
		new Overloader().redirector(12);
		
	}
	
	public void redirector(Object p){
		System.out.println(new Overloader().doit(p));
	}
	
	public String doit(int p){
		return "Int";
	}
	
	public String doit(long p){
		return "long";
	}
	
	public String doit(double p){
		return "double";
	}
	
	public String doit(Employee p){
		return "Employee";
	}
	
	public String doit(String p)
	{
		return "String";
	}

	public String doit(Object p)
	{
		return "Object";
	}
			
			
}

