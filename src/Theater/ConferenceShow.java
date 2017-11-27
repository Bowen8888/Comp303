package Theater;


import java.util.Iterator;

public class ConferenceShow implements Show
{
	private Show aDecorated;
	private int aTime;
	private String aSpeaker;
	
	public ConferenceShow(Show pDecorated, int pTime, String pSpeaker)
	{
		aDecorated = pDecorated;
		aTime = pTime;
		aSpeaker = pSpeaker;
	}

	@Override
	public Iterator<Movie> iterator() {
		return aDecorated.iterator();
	}

	@Override
	public String description() {
		return String.format("%s introducing %s", aSpeaker, aDecorated.description());
	}

	public ConferenceShow clone()
	{
		try {
			ConferenceShow clone = (ConferenceShow) super.clone();
			clone.aDecorated = aDecorated.clone();
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public int runningTime() {
		return aTime + aDecorated.runningTime();
	}
	
}
