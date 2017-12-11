package SynchronizationVsLock;

/*
 * This is an example of a code without synchronization.
 */

public class NormalAccount
{
	private int aBalance;

	public NormalAccount(int pBalance)
	{
		aBalance = pBalance;
	}
	
	public void credit(int pAmount)
	{ 
			aBalance += pAmount; 
	}
	
	public void debit(int pAmount) 
	{
			aBalance -= pAmount; 
	}
	
	public int getBalance() 
	{
		return aBalance;
	}
	
	
	public static void main(String[] pArgs){
		NormalAccount acc1 = new NormalAccount(1000);
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<1000000; i++){
					acc1.credit(10);
				}
				
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<1000000; i++){
					acc1.debit(10);
				}
			}
			
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(acc1.getBalance());
		
		
	}
}
