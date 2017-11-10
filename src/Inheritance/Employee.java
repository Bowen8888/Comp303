package Inheritance;

public class Employee 
{
	private int aSalary;
	private String aName;
	
	public Employee(){
		System.out.println("Employee default constructor");
	}
	
	public Employee(String pName, int pSalary)
	{
		aSalary = pSalary;
		aName = pName;
	}
	
	public String getName()
	{
		return aName;
	}
	
	public int getCompensation()
	{
		return aSalary;
	}
	
	public int getSalary()
	{
		return aSalary;
	}
	
	@Override
	public String toString()
	{
		return aName; 
	}
	
	public void setMentor(Employee e)
	{
		System.out.println("setMentor in Employee class");
	}
}
