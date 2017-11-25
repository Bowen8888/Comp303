package BikerCourierCompany;

public class AlgorithmWokrMax extends AbstractAlgorithm 
{
	private int aMaxHour;
	
	
	public AlgorithmWokrMax(int pHour, int pMax) {
		super(pHour);
		aMaxHour = pMax;
	}

	@Override
	public void assignWorkingHour(Biker pBiker) {
		if(pBiker.getTimeWorked() + super.getWorkingHour() > aMaxHour)
		{
			pBiker.work(aMaxHour);
		}
		else
		{
			pBiker.work(pBiker.getTimeWorked() + super.getWorkingHour());
		}
	}

	public int getMax()
	{
		return aMaxHour;
	}
	
}
