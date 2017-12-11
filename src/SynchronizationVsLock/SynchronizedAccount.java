package SynchronizationVsLock;



public class SynchronizedAccount
{
	private int aBalance;

	public SynchronizedAccount(int pBalance)
	{
		aBalance = pBalance;
	}
	
	public synchronized void credit(int pAmount)
	{ 
			aBalance += pAmount; 
	}
	
	public synchronized void debit(int pAmount) 
	{
			aBalance -= pAmount; 
	}
	
	public synchronized int getBalance() 
	{
		return aBalance;
	}
	
	
	public static void main(String[] pArgs){
		SynchronizedAccount acc1 = new SynchronizedAccount(1000);
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
