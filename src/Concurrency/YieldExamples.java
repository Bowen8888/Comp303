package Concurrency;

public class YieldExamples {

	public static void main(String[] args) {
		new Mythread(1).start();

		new Mythread(2).start();

		new Mythread(3).start();
	}
	
	
}

class Mythread extends Thread{
	private int a;
	public Mythread(int p){
		a = p;
	}
	
	@Override
	public void run(){
		for(int i=0; i<5; i++){
			if(i %5 == 0){
				System.out.println(a + " Yield.");
				Thread.yield();
			}
		}
	}
}