package Inheritance;

public class Manager extends Employee
{
	private int aBonus;
	
	public Manager()
	{
		System.out.println("Manager default constructor");
	}
	
	public Manager(String pName, int pSalary, int pBonus) {
		super(pName, pSalary);
		aBonus = pBonus;
	}
	
	public int getBonus()
	{
		return aBonus;
	}
	
	public int getCompensation()
	{
		return super.getCompensation() +aBonus;
	}
	
	

}
