package theater;

public class AddCommand implements Command
{
	private Command aCommand1;
	private Command aCommand2;
	
	public AddCommand(Command pCommand1, Command pCommand2)
	{
		aCommand1 = pCommand1;
		aCommand2 = pCommand2;
	}
	
	@Override
	public void execute() 
	{
		aCommand1.execute();
		aCommand2.execute();
	}
	
}
