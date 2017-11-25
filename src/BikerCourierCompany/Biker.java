package BikerCourierCompany;

public class Biker {
	private String aName;
	private int aWorkingHour = 0 ;
	
	public Biker(String pName)
	{
		aName = pName;
	}
	
	public String getName()
	{
		return aName;
	}
	
	public void work(int pHour)
	{
		aWorkingHour = pHour;
	}
	
	public int getTimeWorked()
	{
		return aWorkingHour;
	}
}
