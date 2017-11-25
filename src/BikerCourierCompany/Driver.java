package BikerCourierCompany;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] pArgs)
	{
		
		
		Biker bob = new Biker("Bob");
		Biker alice = new Biker("Alice");
		
		Scheduler aScheduler = new Scheduler();
		OverWorkingObserver observer = new OverWorkingObserver();
		aScheduler.addObserver(observer);
		AlgorithmAddHour algo1 = new AlgorithmAddHour(25);
		AlgorithmWokrMax algo2 = new AlgorithmWokrMax(25,40);
		aScheduler.schedule(bob, algo1);
		aScheduler.schedule(bob, algo1);
		aScheduler.schedule(alice, algo2);
		aScheduler.schedule(alice, algo2);
		aScheduler.schedule(alice, algo2);
	}
}
