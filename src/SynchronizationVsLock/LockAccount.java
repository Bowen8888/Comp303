package SynchronizationVsLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * This is an example of a code without synchronization.
 */

public class LockAccount
{
	private final Lock lock = new ReentrantLock();
	private final Condition aBalanceAvailable = lock.newCondition();
	private int aBalance;

	public LockAccount(int pBalance)
	{
		aBalance = pBalance;
	}
	
	public void credit(int pAmount)
	{ 
		lock.lock();
		aBalance += pAmount; 
		lock.unlock();
	}
	
	public void debit(int pAmount) 
	{
		lock.lock();
		aBalance -= pAmount; 
		lock.unlock();
	}
	
	public int getBalance() 
	{
		lock.lock();
		try{
			return aBalance;
		}
		finally{
			lock.unlock();
		}
	}
	
	
	public static void main(String[] pArgs){
		LockAccount acc1 = new LockAccount(1000);
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
