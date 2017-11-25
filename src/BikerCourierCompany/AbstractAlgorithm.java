package BikerCourierCompany;

public abstract class AbstractAlgorithm  implements Algorithm
{
	private int aWorkingHour;
	
	public AbstractAlgorithm(int pHour)
	{
		aWorkingHour = pHour;
	}
	
	public int getWorkingHour()
	{
		return aWorkingHour;
	}
}
