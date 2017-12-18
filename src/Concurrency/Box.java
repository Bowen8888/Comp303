package Concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box 
{
	private int number = 0;
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	public void increment(){
		lock.lock();
		try{
			
			number ++;
			condition.signalAll();

		}
		finally{
			lock.unlock();
		}
	}
	
	public int get(){
		lock.lock();
		
		try {
			condition.await();
			return number;
		} 
		catch (InterruptedException e) {
			return 0;
		}
			
		
		finally{
			lock.unlock();
		}
		
	}
	
	public static void main(String[] args){
		final Box box = new Box();
		final Thread counter = new Thread(new Runnable(){

			@Override
			public void run() {
				while(!Thread.interrupted()){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						return;
					}
					box.increment();
				}
			}
			
		});
		
		final Thread printer = new Thread(new Runnable(){

			@Override
			public void run() {
				while(!Thread.interrupted()){
					System.out.println(box.get());
				}
			}
			
		});
		
		final Thread timer = new Thread(new Runnable(){

			@Override
			public void run() {
				while(box.get()<10){}
				counter.interrupt();
				printer.interrupt();
				
			}
			
		});
		timer.start();
		counter.start();
		printer.start();
		
	}
}
