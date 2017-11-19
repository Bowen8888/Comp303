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
	
	public void setMentor(Manager e)
	{
		System.out.println("setMentor in Manager class");
	}
	
	public static boolean isManager(Object pObject)
	{
		return pObject instanceof Manager;
	}
}
