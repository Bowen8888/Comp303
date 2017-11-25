package BikerCourierCompany;

public class OverWorkingObserver implements Observer
{

	@Override
	public void bikerScheduled(Biker pBiker) {
		if(pBiker.getTimeWorked()>40)
		{
			System.out.println(pBiker.getName() + " has worked for "+ pBiker.getTimeWorked() + " hours!!!");

		}
		
	}

}
