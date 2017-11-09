package theater;

public class WebPageGenerator implements ProgramObserver
{

	@Override
	public void cleared() {
		System.out.println("Program cleared.");
	}

	@Override
	public void showAdded() {
		System.out.println("Show added");
	}

}
