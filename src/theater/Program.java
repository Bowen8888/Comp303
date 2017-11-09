package theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Program
{
	
	private Show[] aShows= new Show[7];
	private List<ProgramObserver> aObservers = new ArrayList<>();
	private List<Command> aCommands = new ArrayList<>();
	public void addObserver(ProgramObserver pObserver)
	{
		aObservers.add(pObserver);
	}
	
	public Program()
	{
		clear();
	}
	
	public void clear(){
		Command command = new Command()
				{

					@Override
					public void execute() {
						Arrays.fill(aShows,NullShow.INSTANCE);
						
					}

					
					
				};
		aCommands.add(command);
		command.execute();
		for(ProgramObserver observer: aObservers)
		{
			observer.cleared();
		}
	}
	
	public void add(Show pShow, Day pDay){
		assert pShow!= null && pDay != null;
		Command command = () -> aShows[pDay.ordinal()] = pShow;
		aCommands.add(command);
		command.execute();
	}
	
	public void remove(Day pDay){
		assert pDay != null;
		Command command = () -> aShows[pDay.ordinal()] = NullShow.DEFAULT;
		aCommands.add(command);
		command.execute();
	}
	
	public Show get(Day pDay)
	{
		return aShows[pDay.ordinal()];
	}
	
	public Command createAddCommand(Show pShow, Day pDay)
	{
		return () -> add(pShow,pDay);
	}
	
	public static void main(String[] args)
	{
		Program program = new Program();
		program.createAddCommand(new Movie("sddf",32,234), Day.MONDAY);
	}
	
	public void clearAndAdd(Show pShow, Day pDay)
	{
		CompositeCommand command = new CompositeCommand(
				() -> Arrays.fill(aShows, NullShow.DEFAULT),
						() -> aShows[pDay.ordinal()] = pShow);
		aCommands.add(command);
		command.execute();
	}
	

}
