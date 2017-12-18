package Inheritance;

public class Examples {

	public static void main(String[] args) {
		Employee alice = new Employee("Alice",1000);
		doit(alice);
		
		Employee bob = new Manager("Bob", 2000, 500);
		doit(bob);
	}
	
	public static void doit(Employee e){
		
		System.out.println(e.toString() + " " + ((Employee)e).getCompensation());
	}

}
