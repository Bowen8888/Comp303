package BikerCourierCompany;

public class AlgorithmAddHour extends AbstractAlgorithm
{
	
	public AlgorithmAddHour(int pHour) {
		super(pHour);
	}

	@Override
	public void assignWorkingHour(Biker pBiker) {
		pBiker.work(pBiker.getTimeWorked() + super.getWorkingHour());
	}

	
}
