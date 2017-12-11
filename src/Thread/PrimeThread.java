package Thread;

public class PrimeThread extends Thread
{
	long minPrime;
    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        long i=minPrime;
        while(!isPrime(i)){
        	i++;
        }
        System.out.println("Prime: " + i );
    }
    
    private boolean isPrime(long n) {
        for(long i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}
